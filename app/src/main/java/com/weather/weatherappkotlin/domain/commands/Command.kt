package com.weather.weatherappkotlin.domain.commands

interface Command<out T>{
    fun execute(): T
}