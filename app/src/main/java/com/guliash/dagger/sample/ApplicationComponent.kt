package com.guliash.dagger.sample

import com.guliash.dagger.utils.StringUtils
import dagger.Component
import dagger.Module
import dagger.Provides

@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun stringUtils(): StringUtils
}

@Module
class ApplicationModule {
    @Provides
    fun provideMagic(): Int {
        return 42
    }
}