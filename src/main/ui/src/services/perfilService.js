export async function getAllPerfis() {

    const response = await fetch('/api/perfis');
    return await response.json();
}

export async function createPerfil(data) {
    const response = await fetch(`/api/perfil`, {
        method: 'POST',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify(data)
    })
    return await response.json();
}

export async function editPerfil(data) {
    const response = await fetch(`/api/edit_perfil`, {
        method: 'POST',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify(data)
    })
    return await response.json();
}