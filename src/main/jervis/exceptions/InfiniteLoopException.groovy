package jervis.exceptions

/**
  A type of <tt>{@link jervis.exceptions.ValidationException}</tt> which is thrown when a lifecycles file keys reference in an infinite loop.

  <h2>Sample usage</h2>
<pre><tt>import jervis.exceptions.InfiniteLoopException
throw new InfiniteLoopException("groovy.maven")</tt></pre><br>
 */
class InfiniteLoopException extends ValidationException {

    /**
      Throw an exception when lifecycle keys reference in an infinite loop.

      @param message A simple message that will be prepended with <tt>"Infinite loop detected.  Last known key: " + message</tt>
     */
    def InfiniteLoopException(String message) {
        super("Infinite loop detected.  Last known key: " + message)
    }
}
