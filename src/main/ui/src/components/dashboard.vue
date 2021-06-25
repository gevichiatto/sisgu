<template>
  <div class="hello">
    <Header/>
    <div class="container mrgnbtm"  style="display: flex; justify-content: center; flex-wrap: wrap;flex-direction: column;">
          <div class="row">
            <CargoGerenciamento @createCargo="cargoCreate($event)" @getAllCargos="getAllCargos()" @editCargo="editarCargo($event)"/>
          </div>
          <div class="row">
            <PerfilGerenciamento @createPerfil="perfilCreate($event)" @getAllPerfis="getAllPerfis()" @editPerfil="editarPerfil($event)"/>
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
import { getAllCargos, createCargo, editCargo } from '../services/cargoService'
import { getAllPerfis, createPerfil, editPerfil } from '../services/perfilService'

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
    // Métodos para API de Cargos
    getAllCargos() {
      getAllCargos().then(response => {
        this.cargos = response;
        CargoGerenciamento.cargos = response;
        return response;
        // this.numberOfUsers = this.users.length
      })
    },
    cargoCreate(data) {
      getAllCargos().then(res => {
        for (var i = 0; i < res.length; i++) {
          if (res[i].nome == data.nome) {
            return;
          }
        }
        createCargo(data).then(response => {
          this.getAllCargos();
        });
      })
    },
    editarCargo(data) {
      editCargo(data).then(res => {
        this.getAllCargos();
      })
    },

    // Métodos para API de Perfis
    getAllPerfis() {
      getAllPerfis().then(response => {
        this.perfis = response;
        PerfilGerenciamento.perfis = response;
        return response;
        // this.numberOfUsers = this.users.length
      })
    },
    perfilCreate(data) {
      getAllPerfis().then(res => {
        for (var i = 0; i < res.length; i++) {
          if (res[i].nome == data.nome) {
            return;
          }
        }
        createPerfil(data).then(response => {
          this.getAllPerfis();
        });
      })
    },
    editarPerfil(data) {
      editPerfil(data).then(res => {
        this.getAllPerfis();
      })
    }
      
      
  }
  // mounted () {
  //   this.getAllCargos();
  // }
}
</script>