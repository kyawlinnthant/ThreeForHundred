package com.kyawlinnthant.database

import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject
import kotlin.test.assertEquals

@OptIn(ExperimentalCoroutinesApi::class)
@HiltAndroidTest
class QuoteDaoTest {
    @get:Rule
    val mainRule = HiltAndroidRule(this)

    @Inject
    lateinit var db: QuoteDatabase
    private lateinit var quoteDao: QuoteDao

    @Before
    fun setup() {
        mainRule.inject()
        quoteDao = db.dao()
    }

    @After
    fun teardown() {
        db.clearAllTables()
        db.close()
    }

    @Test
    fun insert_successfully() = runTest {
        val mockEntity = QuoteEntity(
            id = 123,
            text = "text",
            author = "author",
            category = "category"
        )
        quoteDao.insertQuote(mockEntity)
        val result = quoteDao.queryQuotes().first()
        val actual = result.first()
        assertEquals(mockEntity, actual)
    }
}