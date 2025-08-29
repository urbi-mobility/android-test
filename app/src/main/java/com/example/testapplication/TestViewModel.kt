package com.example.testapplication

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testapplication.model.TestState
import com.example.testapplication.model.getRandomState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class TestViewModel: ViewModel() {
    private val _uiState = MutableStateFlow<TestState>(TestState.StatoIniziale)
    val uiState: StateFlow<TestState> = _uiState


    fun startToUpdate() {
        viewModelScope.launch(Dispatchers.IO) {
            while (true) {
                delay(500)
                updateToRandomState()
            }
        }
    }

    private fun updateToRandomState() {
        _uiState.value = getRandomState()
    }
}