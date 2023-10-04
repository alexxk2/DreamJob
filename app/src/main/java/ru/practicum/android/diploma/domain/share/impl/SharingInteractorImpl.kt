package ru.practicum.android.diploma.domain.share.impl

import ru.practicum.android.diploma.domain.share.SharingInteractor
import ru.practicum.android.diploma.domain.share.SharingRepository
import ru.practicum.android.diploma.domain.share.model.EmailData
import ru.practicum.android.diploma.domain.share.model.PhoneData
import ru.practicum.android.diploma.domain.share.model.SharingData

class SharingInteractorImpl(
    private val sharingRepository: SharingRepository
): SharingInteractor {
    override fun sendEmail(emailData: EmailData) {
        sharingRepository.sendEmail(emailData)
    }

    override fun callPhone(phoneData: PhoneData) {
        sharingRepository.callPhone(phoneData)
    }

    override fun sharingVacancy(sharingData: SharingData) {
        sharingRepository.sharingVacancy(sharingData)
    }
}