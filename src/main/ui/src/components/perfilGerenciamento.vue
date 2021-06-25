<template>
    <div class="container">
        <div class="row">
            <div class="col-md-12 mrgnbtm">
                <div class="row">
                    <h2 class="titles">Gerenciamento de Perfis de Usuários</h2>
                </div>
                <div class="row">
                    <button type="button" @click='showModal()' class="col-md-4 btn btn-cadastro">Cadastrar Perfil</button>
                    <button type="button" @click='showTabela()' class="col-md-4 btn btn-cadastro">{{ labelBotao }}</button>
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
                                <th class="tableHead" @click='sort()'>Nome do Perfil</th>
                                <th class="tableHead">Ação</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr v-for="item in perfis" :key="item.id">
                                <td class="tableRows">{{ item.nome }}
                                <td class="tableRows" @click='editPerfil(item)'>
                                    <button class="btn btn-dark" title="Editar Perfil" >
										<img src="../icons/edit-2.svg" alt="">
									</button>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                
            </div>
        </div>
        <!-- Modal de Cadastro de Perfil -->
        <modal name="modalPerfil">
            <h4 class="modal-titles modal-header">{{ modalTitle }}</h4>
            <form class="modalBody">
                <div class="row">
                    <div class="form-group col-md-6">
                        <label>Nome do Perfil</label>
                        <input type="text" class="form-control" v-model="nome" name="nome" id="nome" aria-describedby="emailHelp" placeholder="Nome do Perfil" />
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
import { getAllPerfis } from '../services/perfilService'
export default {
    name: 'perfilGerenciamento',
    data() {
        return {
            nome: '',
            results: false,
            perfis: '',
            modalTitle: '',
            acaoBotao: '',
            id: null,
            labelBotao: "Listar Perfis"
        }
    },
    methods: {
        showModal() {
            this.modalTitle = "Cadastro de perfis";
            this.acaoBotao = "Cadastrar";
            this.$modal.show('modalPerfil',);
            this.clearForm();
        },
        async showTabela() {
            this.results = !this.results;
            this.labelBotao = !this.results ? "Listar Perfis" : "Ocultar Perfis";
            this.perfis = await getAllPerfis();
        },
        clearForm() {
            this.nome = "";
        },
        createPerfil() {
          const payload = {
              nome: this.nome
          }
          this.$emit('createPerfil', payload);
          this.clearForm();
          this.$modal.hide('modalPerfil');
        },
        sort() {
            this.perfis.sort((a,b) => b.nome > a.nome ? -1 : 1);
        },
        editPerfil(perfil) {
            this.modalTitle = "Edição de perfis";
            this.acaoBotao = "Salvar";
            this.nome = perfil.nome;
            this.id = perfil.id;
            this.$modal.show('modalPerfil',);
        },
        acao() {
            if (this.acaoBotao == "Cadastrar")
                this.createPerfil();
            else
                this.editarPerfil();
        },
        async editarPerfil() {
            console.log("Editando")
            const payload = {
                nome: this.nome,
                id: this.id
            }
            this.$emit('editPerfil', payload);
            this.$modal.hide('modalPerfil');
            this.perfis = await getAllPerfis();
        }
    },
}
</script>