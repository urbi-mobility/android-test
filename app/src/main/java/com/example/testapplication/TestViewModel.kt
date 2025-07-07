package com.example.testapplication

import androidx.lifecycle.ViewModel
import com.example.testapplication.model.TestState
import com.example.testapplication.model.getRandomState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class TestViewModel: ViewModel() {
    private val _uiState = MutableStateFlow<TestState>(TestState.StatoIniziale)
    val uiState: StateFlow<TestState> = _uiState

    fun updateToRandomState() {
        _uiState.value = getRandomState()
    }
}