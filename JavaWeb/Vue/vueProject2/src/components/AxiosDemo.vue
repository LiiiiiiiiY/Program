<script setup>
import { ref, reactive } from "vue";
import axios from "axios";

let user = reactive({ id: "2110650210", name: "", age: "", tel: "" });
let myStyle = ref("style1");

function changeStyle1() {
  myStyle.value = "style2";
}

function changeStyle2() {
  myStyle.value = "style1";
}

function getUser() {
  axios
    .get("http://localhost:8080/user/getUser?id=${user.id}")
    .then((response) => console.log(response.data))
    .catch((error) => console.log(error));
}

function postUser() {
  axios
    .post("http://localhost:8080/user/postUser", user)
    .then((response) => console.log(response.data))
    .catch((error) => console.log(error));
}
</script>

<template>
  <div v-bind:class="myStyle">
    <h1>Axios Test</h1>
    <div>学号: <input type="text" v-model="user.id" readonly="readonly" /></div>
    <div>姓名: <input type="text" v-model="user.name" /></div>
    <div>年龄: <input type="text" v-model="user.age" /></div>
    <div>电话: <input type="text" v-model="user.tel" /></div>
    <button @click="getUser">获取用户信息</button>
    <button @click="postUser">提交用户信息</button>
  </div>
</template>

<style scoped>
div {
  font-size: 1.5em;
  margin: 15px;
}
input {
  font-size: 1em;
}
button {
  font-size: 1.5em;
  margin: 15px;
}
.style1 {
  background-color: rgb(165, 242, 255);
}
.style2 {
  background-color: pink;
}
</style>
