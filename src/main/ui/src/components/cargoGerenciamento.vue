<template>
    <div class="container">
        <div class="row">
            <div class="col-md-12 mrgnbtm">
                <div class="row">
                    <h2 class="titles">Gerenciamento de Cargos</h2>
                </div>
                <div class="row">
                    <button type="button" @click='showModal()' class="col-md-4 btn btn-cadastro">Cadastrar Cargo</button>
                    <button type="button" @click='showTabela()' class="col-md-4 btn btn-cadastro">Listar Cargos</button>
                </div>
            </div>
        </div>
        <hr class="w-25 my-4">
        <div class="row">
            <div v-if="results" class="tableContainer">
                <div class="tableContent">
                        <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th class="tableHead" @click='sort()'>Nome do Cargo</th>
                                <th class="tableHead">Ação</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr v-for="item in cargos" :key="item.id">
                                <td class="tableRows">{{ item.nome }}</td>
                                <td class="tableRows" @click='editCargo(item)'>
                                    <button class="btn btn-dark" title="Editar Cargo" >
										<img src="../icons/edit-2.svg" alt="">
									</button>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                
            </div>
        </div>
        <!-- Modal de Cadastro de Cargos -->
        <modal name="modalCargo">
            <h4 class="modal-titles modal-header">{{ modalTitle }}</h4>
            <form class="modalBody">
                <div class="row">
                    <div class="form-group col-md-6">
                        <label>Nome do Cargo</label>
                        <input type="text" class="form-control" v-model="nome" name="nome" id="nome" aria-describedby="emailHelp" placeholder="Nome do Cargo" />
                    </div>
                </div>
                <div class="row">
                    <button type="button" @click='acao()' class="btn btn-cadastro">{{ acaoBotao }}</button>
                </div>
            </form>
        </modal>
    </div>
</template>

<script>
import { getAllCargos } from '../services/cargoService'
export default {
    name: 'cargoGerenciamento',
    data() {
        return {
            nome: '',
            results: false,
            cargos: '',
            modalTitle: '',
            acaoBotao: ''
        }
    },
    methods: {
        showModal() {
            this.modalTitle = "Cadastro de cargos";
            this.acaoBotao = "Cadastrar";
            this.$modal.show('modalCargo',);
            this.clearForm();
        },
        async showTabela() {
            this.results = !this.results;
            this.cargos = this.cargos ? this.cargos : await getAllCargos();
        },
        clearForm() {
            this.nome = "";
        },
        createCargo() {
          const payload = {
              nome: this.nome
          }
          this.$emit('createCargo', payload);
          this.clearForm();
          this.$modal.hide('modalCargo');
        },
        sort() {
            this.cargos.sort((a,b) => b.nome > a.nome ? -1 : 1);
        },
        editCargo(cargo) {
            this.modalTitle = "Edição de cargos";
            this.acaoBotao = "Salvar";
            this.nome = cargo.nome;
            this.$modal.show('modalCargo',);
        },
        acao() {
            if (this.acaoBotao == "Cadastrar")
                this.createCargo();
            else
                this.editarCargo();
        },
        editarCargo() {
            console.log("Editar cargo");
            this.$modal.hide('modalCargo');
        }
    },
}
</script>