package test

/**
 * This function can only be used by fully qualified name in plugins block.
 * @return the input message
 */
fun brokenEcho(message: String): String = message
