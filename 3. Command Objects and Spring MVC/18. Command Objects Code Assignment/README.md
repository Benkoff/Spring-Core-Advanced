# Spring Core - Spring MVC
## 18. Command Objects Code Assignment

Okay, it's your turn to write some code. Let's apply what we've learned in this module.

1. Create a new ProductForm object. This should have id, version, description, price, and image url. Properties should match Product domain class.
2. Description cannot be blank, and must be more than 5 characters, but less than 200.
3. Price must be a number greater than zero, less than 5000.
4. Use HTML 5 to limit input of price as a number.
5. Image URL string must be a valid URL.
6. Update Product controller to use ProductForm Command object. Should validate, and redirect to form if not valid.
7. Update product template to use ProductForm. Add error notice at top. Each field should be display error message information.
8. Create user friendly custom error messages for each validation constraint.
9. Create a converter for ProductForm to Product and Product to ProductForm.
10. Update persistence services to maintain CRUD functionality. Override saveOrUpdate method to accept and return ProductForm.
11. Verify all unit tests are passing.

##### Extra Credit Challenge
On the CustomerForm object, create a custom validator to verify the two password strings match. If they do not, reject both fields & provide notification message to user. 
* Hint: you will not be able to use an annotation for this. You will need to google for the solution. I did not show you how to do this.