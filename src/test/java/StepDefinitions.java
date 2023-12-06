import com.exercise.CountResult;
import com.exercise.VowelCounter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {

    private String[] input;

    private List<CountResult> results;

    @Given("the following words:")
    public void the_following_words(List<String> list) {
        input = list.toArray(new String[list.size()]);
    }

    @When("count vowels and consonants")
    public void count_vowels_and_consonants() {
        results = VowelCounter.getLetterCount(input);
    }

    @Then("this counts should return:")
    public void this_counts_should_return(List<List<Integer>> expected) {
        assertEquals(expected.size(), results.size());

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(2, expected.get(i).size());
            assertEquals(expected.get(i).get(0), results.get(i).getVowelCount());
            assertEquals(expected.get(i).get(1), results.get(i).getConsonantCount());
        }
    }

    @Then("null should be returned")
    public void null_should_be_returned() {

        assertEquals(null, results);
    }

    @Given("empty list")
    public void empty_list() {

        input = new String[0];
    }

    @Then("empty list should be returned")
    public void empty_list_should_be_returned() {

        assertEquals(0,results.size());
    }


}




