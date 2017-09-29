package com.weather.weatherappkotlin.domain.commands

import com.weather.weatherappkotlin.domain.model.ForecastList
import com.weather.weatherappkotlin.domain.mappers.ForecastDataMapper
import com.weather.weatherappkotlin.data.ForecastRequest

class RequestForecastCommand(private val zipCode: String) : Command<ForecastList> {

    override fun execute(): ForecastList {

        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(
                forecastRequest.execute())
    }

}