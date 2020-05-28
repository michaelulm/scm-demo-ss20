package at.fhj.iit;
	public class EmptyCocktailException extends Exception {

		/**
		 * Default Error Message for the EmptyCocktailException class
		 */
		public static final String ERROR_MESSAGE = "Cocktail is empty!";

		/**
		 * Creates a new instance of the class EmptyCocktailException with the default message.
		 */
		public EmptyCocktailException() {
			super(ERROR_MESSAGE);
		}

		/**
		 * Creates a new instance of the class EmptyCocktailException with the provided error message
		 *
		 * @param message the error message of the exception
		 */
		public EmptyCocktailException(String message) {
			super(message);
		}
	}
