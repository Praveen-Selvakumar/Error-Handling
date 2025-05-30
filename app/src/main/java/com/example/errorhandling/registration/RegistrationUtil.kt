package com.example.errorhandling.registration

class RegistrationUtil {


    fun isDetailsValid(name: String = "", password: String  = "", confirmPassword: String = ""): Boolean {
        if (name.isEmpty() || name.length < 3) {
            return false
        } else if (confirmPassword.isEmpty() || password.isEmpty()) {
            return false
        } else if (password.length != confirmPassword.length) {
            return false
        } else if (!password.equals(confirmPassword)) {
            return false
        }
        return true
    }

}