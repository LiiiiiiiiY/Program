<script setup>
import {ref,reactive} from 'vue';
import axios from 'axios';

let user =reactive({id:'1001',name:'',age:22,tel:''})

function getUser(){
    axios.get('http://localhost:8080/user/getUser?id=${user.id}')
        .then(response=>console.log(response.data))
        .catch(error=>console.log(error))
}

function postUser(){
    axios.post('http://localhost:8080/user/postUser',user)
        .then(response=>console.log(response.data))
        .catch(error=>console.log(error))
}

</script>

<template>
    <div>
        <h1>Axios Test</h1>
        <p>id号:{{ user.id }}</p>
        <div>
            <p>姓名:</p>
            <input type="text" v-model="user.name">
        </div>
        <div>
            <p>年龄:</p>
            <input type="text" v-model="user.age">
        </div>
        <div>
            <p>电话:</p>
            <input type="text" v-model="user.tel">
        </div>
        <div>
            <button @click="getUser">获取用户信息</button>
            <button @click="postUser">提交用户信息</button>
        </div>
    </div>
</template>

<style scoped>
p{
    font-size: 1.5em;
    margin-top: 15px;
}
button{
    font-size: 1.5em;
    margin-top: 15px;
    margin-right: 40px;
}
input{
    font-size: 1.5em;
    margin-top: 15px;
}

</style>
