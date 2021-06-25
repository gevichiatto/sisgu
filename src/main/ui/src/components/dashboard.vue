<template>
  <div class="hello">
    <Header/>
    <div class="container mrgnbtm"  style="display: flex; justify-content: center; flex-wrap: wrap;flex-direction: column;">
          <div class="row">
            <CargoGerenciamento @createCargo="cargoCreate($event)" />
          </div>
          <div class="row">
            <PerfilGerenciamento/>
          </div>
          <div class="row">
            <UsuarioGerenciamento/>
          </div>
    </div>
    <!-- <div class="row mrgnbtm">
        <Users v-if="users.length > 0" :users="users" />
    </div> -->
  </div>
</template>

<script>
import Header from './header.vue'
import CargoGerenciamento from './cargoGerenciamento.vue'
import PerfilGerenciamento from './perfilGerenciamento.vue'
import UsuarioGerenciamento from './usuarioGerenciamento.vue'
// import Users from './users.vue'
import { createCargo } from '../services/cargoService'

export default {
  name: 'Dashboard',
  components: {
    Header,
    CargoGerenciamento,
    PerfilGerenciamento,
    UsuarioGerenciamento,
    // Users
  },
  data() {
    return {
      users: [],
      numberOfUsers: 0
    }
  },
  methods: {
    // getAllCargos() {
    //   getAllCargos().then(response => {
    //     console.log(response)
    //     this.users = response
    //     this.numberOfUsers = this.users.length
    //   })
    // },
    cargoCreate(data) {
      console.log('data:::', data)
      // data.id = this.numberOfUsers + 1
      // this.numberOfUsers = data.id;
      createCargo(data).then(response => {
        console.log("Resposta da req: ", response);
        // this.getAllCargos();
      });
    }
  }
  // mounted () {
  //   this.getAllCargos();
  // }
}
</script>