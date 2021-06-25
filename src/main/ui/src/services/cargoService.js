export async function getAllCargos() {

    const response = await fetch('/api/cargos');
    return await response.json();
}

export async function createCargo(data) {
    const response = await fetch(`/api/cargo`, {
        method: 'POST',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify(data)
    })
    return await response.json();
}