package ru.practicum.android.diploma.di.modules

import dagger.Binds
import dagger.Module
import ru.practicum.android.diploma.domain.details.DetailsInteractor
import ru.practicum.android.diploma.domain.details.DetailsInteractorImpl
import ru.practicum.android.diploma.domain.developers.DevelopersInteractor
import ru.practicum.android.diploma.domain.developers.DevelopersInteractorImpl
import ru.practicum.android.diploma.domain.favourite.FavouriteInteractor
import ru.practicum.android.diploma.domain.favourite.FavouriteInteractorImpl
import ru.practicum.android.diploma.domain.filter.FilterInteractor
import ru.practicum.android.diploma.domain.filter.FilterInteractorImpl
import ru.practicum.android.diploma.domain.search.SearchInteractor
import ru.practicum.android.diploma.domain.search.SearchInteractorImpl
import ru.practicum.android.diploma.domain.similar.SimilarInteractor
import ru.practicum.android.diploma.domain.similar.SimilarInteractorImpl

@Module
abstract class DomainModule {
    @Binds
    abstract fun provideDetailsInteractor(interactor: DetailsInteractorImpl): DetailsInteractor
    @Binds
    abstract fun provideDevelopersInteractor(interactor: DevelopersInteractorImpl): DevelopersInteractor
    @Binds
    abstract fun provideFavouriteInteractor(interactor: FavouriteInteractorImpl): FavouriteInteractor
    @Binds
    abstract fun provideFilterInteractor(interactor: FilterInteractorImpl): FilterInteractor
    @Binds
    abstract fun provideSearchInteractor(interactor: SearchInteractorImpl): SearchInteractor
    @Binds
    abstract fun provideSimilarInteractor(interactor: SimilarInteractorImpl): SimilarInteractor

}