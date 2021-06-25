<template>
  <div id="app">
    <Dashboard />
  </div>
</template>

<script>
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import Dashboard from './components/dashboard.vue'

export default {
  name: 'app',
  components: {
    Dashboard
  }
}
</script>

<style src="vue-multiselect/dist/vue-multiselect.min.css"></style>

<style>
  @import './assets/styles/global.css';
</style>