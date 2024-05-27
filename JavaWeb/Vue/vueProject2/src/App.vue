<script setup>
import AxiosDemo from "./components/AxiosDemo.vue";
import Order from "./components/Order.vue";
import { RouterLink, RouterView } from "vue-router";
import Aside from "./components/Element/Aside.vue";
import Header from "./components/Element/Header.vue";
</script>

<template>
  <div>
    <Header/>
    <div style="display: flex">
      <Aside />
      <router-view/>
    </div>
  </div>
</template>

<style scoped>

</style>
