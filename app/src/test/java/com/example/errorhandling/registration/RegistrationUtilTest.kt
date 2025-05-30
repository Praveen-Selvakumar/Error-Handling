package com.example.errorhandling.registration

import org.junit.Test


class RegistrationUtilTest {

    @Test
    fun `name is less that 3 return false`() {
        val result = RegistrationUtil().isDetailsValid(name = "sr")
        assert(result)
    }


    @Test
    fun `password is not equal return false`(){
        val  result = RegistrationUtil().isDetailsValid(password = "123", confirmPassword = "321")
        assert(result)
    }

    @Test
    fun `pass testcase if all are valid`(){
        val result = RegistrationUtil().isDetailsValid(name = "Praveen", password =  "uumai007", confirmPassword = "uumai007")
        assert(result)
    }

}