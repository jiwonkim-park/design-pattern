package test.adapter

import main.kotlin.adapter.MallardDuck
import main.kotlin.adapter.TurkeyAdapter
import main.kotlin.adapter.WildTurkey
import org.junit.Test

internal class TurkeyAdapterTest {
    @Test
    fun `turkey to duck`() {
        val turkey = WildTurkey()
        val turkeyAdapter = TurkeyAdapter(turkey)

        assert(turkeyAdapter.quack().equals(turkey.gobble()))
    }


}