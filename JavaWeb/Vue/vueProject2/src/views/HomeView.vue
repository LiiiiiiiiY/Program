<script setup>
import { ref, reactive, onMounted } from "vue";
import axios from 'axios';

let search = ref("");
let pageNum = ref(1);
let pageSize = ref(4);
let total = ref(5);
let tableData = reactive([]);

onMounted(()=>{
  load()
})

function load() {
  let url = 'http://localhost/user/userPage?pageNum=' + pageNum.value
    + '&pageSize=' + pageSize.value + '&search=' + search.value
  axios.get(url)
    .then(function (response) {
      console.log(response);
      tableData.length = 0
      tableData.push(...response.data.data.records)
      pageSize.value = response.data.data.size
      total.value = response.data.data.total
    })
    .catch(function (error) {
      console.log(error);
    });
}

function onSearch(){
  load()
}

function handleSizeChange(num){
  pageSize.value = num
  load()
}

function handleCurrentChange(num){
  pageNum.value = num
  load()
}

</script>

<template>
  <div style="display: flex; flex-direction: column;">
    <!--  搜索区域 -->
    <div style="margin: 10px 0">
      <el-input v-model="search" placeholder="请输入关键字" style="width: 20%"></el-input>
      <el-button type="primary" @click="onSearch">查询</el-button>
    </div>

    <el-table :data="tableData" style="width: 100%">
      <el-table-column prop="id" label="ID" width="180" />
      <el-table-column prop="name" label="姓名" width="120" />
      <el-table-column prop="age" label="年龄" width="120" sortable />
      <el-table-column prop="email" label="邮箱" width="180" />
      <el-table-column prop="createTime" label="创建时间" width="180" />
    </el-table>

    <div style="margin: 10px 0">
      <el-pagination v-model:currentPage="pageNum" v-model:page-size="pageSize" :page-sizes="[5, 10, 50, 100]"
        :small="small" :disabled="disabled" :background="background" layout="total, sizes, prev, pager, next, jumper"
        :total="total" @size-change="handleSizeChange" @current-change="handleCurrentChange" />
    </div>
  </div>
</template>

<style scoped>

</style>