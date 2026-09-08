public final class HelloWorldStyle {

    /**
     * Prevent instantiation of utility class.
     */
    private HelloWorldStyle() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * The main method for the application.
     *
     * @param args Command line arguments
     */
    public static void main(final String[] args) {
        System.out.println("hello with style");
        System.out.println("bye with style");
    }
}

