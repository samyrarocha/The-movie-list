package com.example.projeto_integrador.common.domain.model

import java.io.IOException

class NoMoreAnimalsException(message: String): Exception(message)

class NetworkUnavailableException(message: String = "No network available :(") : IOException(message)