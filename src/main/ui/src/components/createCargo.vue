<template>
  <div class="container">
    <div class="row">
        <div class="col-md-7 mrgnbtm">
        <h2>Cadastrar Cargo</h2>
            <form>
                <div class="row">
                    <div class="form-group col-md-6">
                        <label htmlFor="exampleInputEmail1">Nome do Cargo</label>
                        <input type="text" class="form-control" v-model="cargoName" name="cargoName" id="cargoName" aria-describedby="emailHelp" placeholder="Nome do Cargo" />
                    </div>
                </div>
                <button type="button" @click='createCargo()' class="btn btn-danger">Criar</button>
            </form>
        </div>
    </div>
    </div>
</template>

<script>
export default {
    name: 'createCargo',
    data() {
        return {
            cargoName: '',
        }
    },
    methods: {
        createCargo() {
            console.log(this.cargoName)
            const payload = {
                cargoName: this.cargoName,
            }
            this.$emit('createCargo', payload)
            this.clearForm();
        },
        clearForm() {
            this.cargoName = "";
        }
    }
}
</script>