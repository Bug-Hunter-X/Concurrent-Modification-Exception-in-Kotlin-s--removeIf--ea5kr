# Kotlin `removeIf` Concurrent Modification Issue

This repository demonstrates a potential issue with Kotlin's `removeIf` function when used in multi-threaded environments.  The code in `bug.kt` showcases how concurrent modification can lead to unexpected results or exceptions. The solution in `bugSolution.kt` provides a safer approach to handle this scenario.   The issue arises because `removeIf` modifies the list while iterating, which is unsafe if another thread is making changes concurrently.