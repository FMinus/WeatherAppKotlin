package com.weather.weatherappkotlin.ui.activities

import com.weather.weatherappkotlin.domain.model.Forecast

interface OnItemClickListener{
    operator fun invoke(forecast: Forecast)
}