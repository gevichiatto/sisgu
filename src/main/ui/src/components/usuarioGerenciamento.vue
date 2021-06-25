<template>
    <div class="container">
        <div class="row">
            <div class="col-md-12 mrgnbtm">
                <div class="row">
                    <h2 class="titles">Gerenciamento de Usuários</h2>
                </div>
                <div class="row">
                    <button type="button" @click='showModal()' class="col-md-4 btn btn-cadastro">Cadastrar Usuário</button>
                    <button type="button" @click='showTabela()' class="col-md-4 btn btn-cadastro">Listar Usuários</button>
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
                                <th>Nome do Perfil</th>
                                <th>Ação</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr v-for="item in users" :key="item.id">
                                <td>{{ item.id }}</td>
                                <td>{{ item.firstName }}</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                
            </div>
        </div>
        <!-- Modal de Cadastro de Usuário -->
        <modal name="modalCadastroUsuario" :height="500">
            <h4 class="modal-titles modal-header">Cadastro de usuário</h4>
            <form>
                <div class="modalBody">
                    <div class="row">
                        <div class="form-group col-md-6">
                            <label>Nome do Usuário</label>
                            <input type="text" class="form-control" v-model="usuarioName" name="usuarioName" id="usuarioName" aria-describedby="emailHelp" placeholder="Nome do Usuário" />
                        </div>
                        <div class="form-group col-md-6">
                            <label>CPF</label>
                            <input type="text" class="form-control" v-model="cpf" name="cpf" id="cpf" aria-describedby="emailHelp" placeholder="CPF" />
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-md-6">
                            <label>Data de nascimento</label>
                            <input type="date" class="form-control" v-model="dataNascimento" name="dataNascimento" id="dataNascimento" aria-describedby="emailHelp" />
                        </div>
                        <div class="form-group col-md-6">
                            <label>Sexo</label>
                            <multiselect v-model="valueSexo" :options="optionsSexo" placeholder="Selecione um sexo" label="name" track-by="name"></multiselect>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-md-6">
                            <label>Cargo</label>
                            <multiselect v-model="valueCargo" :options="optionsCargo" placeholder="Selecione um cargo" label="name" track-by="name"></multiselect>
                        </div>
                        <div class="form-group col-md-6">
                            <label>Perfil</label>
                            <multiselect v-model="valuePerfil" :options="optionsPerfil" placeholder="Selecione um perfil" label="name" track-by="name"></multiselect>
                        </div>
                    </div>
                    <div class="row">
                        <button type="button" @click='createPerfil()' class="btn btn-cadastro">Cadastrar</button>
                    </div>
                </div>
            </form>
        </modal>
    </div>
</template>

<script>
export default {
    name: 'usuarioGerenciamento',
    data() {
        return {
            usuarioName: '',
            cpf: '',
            dataNascimento: '',
            results: false,
            valueSexo: null,
            optionsSexo: [
                { name: 'M', language: 'JavaScript' },
                { name: 'F', language: 'Elixir' }
            ],
            valueCargo: null,
            optionsCargo: [
                { name: 'Vue.js', language: 'JavaScript' },
                { name: 'Rails', language: 'Ruby' },
                { name: 'Sinatra', language: 'Ruby' },
                { name: 'Laravel', language: 'PHP' },
                { name: 'Phoenix', language: 'Elixir' }
            ],
            valuePerfil: null,
            optionsPerfil: [
                { name: 'Vue.js', language: 'JavaScript' },
                { name: 'Rails', language: 'Ruby' },
                { name: 'Sinatra', language: 'Ruby' },
                { name: 'Laravel', language: 'PHP' },
                { name: 'Phoenix', language: 'Elixir' }
            ]
        }
    },
    methods: {
        showModal() {
            this.$modal.show('modalCadastroUsuario',);
            this.clearForm();
        },
        showTabela() {
            this.results = !this.results;
        },
        clearForm() {
            this.usuarioName = "";
            this.cpf = "";
            this.dataNascimento = "";
            this.sexo = "";
            this.cargo = "";
            this.perfil = "";
        }
    },
}
</script>