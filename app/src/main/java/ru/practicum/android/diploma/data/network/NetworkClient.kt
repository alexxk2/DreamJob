package ru.practicum.android.diploma.data.network


import ru.practicum.android.diploma.data.network.dto.Response
import ru.practicum.android.diploma.data.network.dto.VacancyRequest

interface NetworkClient {
    suspend fun search(dto: VacancyRequest): Response

    suspend fun getAllCountries(): Response

    suspend fun getAllRegionsInCountry(countryId: String): Response

    suspend fun getAllIndustries(): Response

    suspend fun getVacancyDetail(vacancyId: String): Response

    suspend fun getSimilarVacancy(vacancyId: String, dto: VacancyRequest): Response
}