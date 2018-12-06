package com.cognizant.bookstore;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public final class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;

//    @Autowired
//    private BookRepository bookRepository;

    @Test
    public void listReturnEmptyListOfBooks() throws Exception{

        //exercise
        final String responseContent = mockMvc.perform(get("/books"))
                .andExpect(status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString();

        //Assert
        assertThat(responseContent, is("[]"));

        //bookRepository.save(new Book("Altered Carbon","Richard K Morgan"));
    }
}
