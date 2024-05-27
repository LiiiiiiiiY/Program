<script setup>
import { ref, reactive, onMounted } from "vue";

let search = ref("");
let pageNum = ref(1);
let pageSize = ref(4);

let tableData = reactive([]);

onMounted(()=>{
  load()
})

function load(){
  let url = 'http://localhost/user/userPage?pageNum=' + pageNum.value + '&pageSize=' + pageSize.value + '&search='+ search.value;
  axios.get(url)
    .then(function (response){
      console.log(response);
      tableData.push(...response.data.data.records)
    })
    .catch(error => console.error(error));
}

</script>

<template>
     <div style="display: flex; flex-direction: column;">
    <!--  搜索区域 -->
    <div style="margin: 10px 0">
      <el-input v-model="search" placeholder="请输入关键字" style="width: 20%"></el-input>
      <el-button type="primary">查询</el-button>
    </div>

    <el-table :data="tableData" style="width: 100%">
      <el-table-column prop="id" label="ID" width="200" />
      <el-table-column prop="name" label="姓名" width="120" />
      <el-table-column prop="age" label="年龄"  width="120" />
      <el-table-column prop="email" label="邮箱" width="200" />
      <el-table-column prop="createTime" label="创建时间" width="200" />
    </el-table>

    <div style="margin: 10px 0">
      <el-pagination v-model:currentPage="currentPage4" v-model:page-size="pageSize4" :page-sizes="[5, 10, 50, 100]"
        :small="small" :disabled="disabled" :background="background" layout="total, sizes, prev, pager, next, jumper"
        :total="400" @size-change="handleSizeChange" @current-change="handleCurrentChange" />
    </div>
  </div>
</template>

<style scoped>

</style>