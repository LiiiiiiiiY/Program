<script setup>
import { ref, reactive } from "vue";

let services = reactive([
  {
    name: "主板",
    price: 3000,
    flag: false,
  },{
    name: "显卡",
    price: 5000,
    flag: false,
  },{
    name: "CPU",
    price: 3000,
    flag: false,
  },{
    name: "内存条",
    price: 300,
    flag: false,
  },{
    name: "硬盘",
    price: 300,
    flag: false,
  },{
    name: "其他",
    price: 5000,
    flag: false,
  },
]);

function changeFlag(s) {
  s.flag = !s.flag;
}

function total() {
  let total = 0;
  services.forEach(function (s) {
    if (s.flag) {
      total += s.price;
    }
  });
  
  return total;
}

function currency(value) {
    return '￥' + value.toFixed(2);
};

</script>

<template>
  <form id="main">
    <h1>订单</h1>
    <ul>
      <li v-for="item in services" :key="item.name" @click="changeFlag(item)" :class="{flag: item.flag}">
        {{ item.name }}
        <span>{{ currency(item.price) }}</span>
      </li>
    </ul>
    <div class="total">
      共计<span>{{ currency(total()) }}</span>
    </div>
  </form>
</template>

<style scoped>
* {
  margin: 0;
  padding: 0;
}

form {
  background-color: #61a1bc;
  border-radius: 2px;
  box-shadow: 0 1px 1px #ccc;
  width: 400px;
  padding: 35px 60px;
  margin: 50px auto;
}

form h1 {
  color: #fff;
  font-size: 64px;
  font-family: "Cookie", cursive;
  font-weight: normal;
  line-height: 1;
  text-shadow: 0 3px 0 rgba(0, 0, 0, 0.1);
}

form ul {
  list-style: none;
  color: #fff;
  font-size: 20px;
  font-weight: bold;
  text-align: left;
  margin: 20px 0 15px;
}

form ul li {
  padding: 20px 30px;
  background-color: #e35885;
  margin-bottom: 8px;
  box-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
  cursor: pointer;
}

form ul li span {
  float: right;
}

form ul li span input {
  width: 60px; /* 调整输入框的宽度 */
  padding: 6px 10px; /* 调整内边距 */
}

form ul li.flag {
  background-color: #8ec16d;
}

div.total {
  border-top: 1px solid rgba(255, 255, 255, 0.5);
  padding: 15px 30px;
  font-size: 20px;
  font-weight: bold;
  text-align: left;
  color: #fff;
}

div.total span {
  float: right;
}
</style>