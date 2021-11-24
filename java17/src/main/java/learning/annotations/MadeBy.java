package learning.annotations;

/**
 * Can be used to mark give the author of the code credit.
 */
public @interface MadeBy {
    /**
     * @return the name of the person who made the code
     */
    String author() default "";
}
