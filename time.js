function displayDateTime() {
    const dataHoraAtual = new Date();
    const dataFormatada = dataHoraAtual.toLocaleString();
    const horaFormatada = dataHoraAtual.toLocaleTimeString();

    console.log(`${dataFormatada}`)
}
displayDateTime()