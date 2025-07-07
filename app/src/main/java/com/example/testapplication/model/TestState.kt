package com.example.testapplication.model

sealed class TestState {
    data object StatoIniziale : TestState()
    data class StatoCaricamento(val messaggio: String) : TestState()
    data class StatoErrore(val errore: String) : TestState()
    data class StatoCompletato(val risultato: String) : TestState()
}