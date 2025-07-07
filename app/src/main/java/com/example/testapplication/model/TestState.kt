package com.example.testapplication.model

sealed class TestState {
    data object StatoIniziale : TestState()
    data class StatoCaricamento(val messaggio: String) : TestState()
    data class StatoErrore(val errore: String) : TestState()
    data class StatoCompletato(val risultato: String) : TestState()
}

fun getRandomState(): TestState {
    return when ((1..4).random()) {
        1 -> TestState.StatoIniziale
        2 -> TestState.StatoCaricamento("Caricamento in corso...")
        3 -> TestState.StatoErrore("Errore di rete")
        4 -> TestState.StatoCompletato("Operazione completata con successo")
        else -> TestState.StatoIniziale
    }
}