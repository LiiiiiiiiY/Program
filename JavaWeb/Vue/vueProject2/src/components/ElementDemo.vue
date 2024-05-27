<script setup>
import { ref, reactive } from "vue";

let tableData = [
  {
    date: "2016-05-03",
    name: "李四",
    address: "重庆市南岸区南山街道崇教路1号",
  },
  {
    date: "2022-05-02",
    name: "张三",
    address: "重庆市南岸区学府大道9号",
  },
  {
    date: "2023-05-04",
    name: "王峰",
    address: "重庆市沙坪坝区沙正街174号",
  },
  {
    date: "2024-05-01",
    name: "赵成",
    address: "重庆市北碚区天生路2号",
  },
];
</script>

<template>
  <div class="Title">后台管理</div>

  <div style="width: 100px">
    <el-dropdown style="margin-top: 20px">
      <span class="el-dropdown-link">
        张三
        <el-icon class="el-icon--right">
          <arrow-down />
        </el-icon>
      </span>
      <template #dropdown>
        <el-dropdown-menu>
          <el-dropdown-item>个人信息</el-dropdown-item>
          <el-dropdown-item>退出系统</el-dropdown-item>
        </el-dropdown-menu>
      </template>
    </el-dropdown>
  </div>

  <el-menu
    default-active="2"
    class="el-menu-vertical-demo"
    @open="handleOpen"
    @close="handleClose"
  >
    <el-sub-menu index="1">
      <template #title>
        <el-icon>
          <location />
        </el-icon>
        <span>导航一</span>
      </template>
      <el-menu-item-group title="第一项">
        <el-menu-item index="1-1">item one</el-menu-item>
        <el-menu-item index="1-2">item two</el-menu-item>
      </el-menu-item-group>
      <el-menu-item-group title="第二项">
        <el-menu-item index="1-3">item three</el-menu-item>
        <el-menu-item index="1-3-1">item one</el-menu-item>
      </el-menu-item-group>
    </el-sub-menu>
    <el-menu-item index="2">
      <el-icon><icon-menu /></el-icon>
      <span>导航二</span>
    </el-menu-item>
    <el-menu-item index="3" disabled>
      <el-icon>
        <document />
      </el-icon>
      <span>导航三</span>
    </el-menu-item>
  </el-menu>

  <div style="margin: 10px 0">
  <el-input v-model="search" placeholder="请输入关键字" style="width: 20%"></el-input>
  <el-button type="primary">查询</el-button>
</div>
</template>

<style scoped>
div.Title {
  width: 200px;
  padding-left: 30px;
  font-weight: bold;
  color: dodgerblue;
}
</style>