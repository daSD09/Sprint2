package REstepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition {
	
	         WebDriver driver;
			@Given("User is on login page")
			public void user_is_on_login_page() {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRAMANA DAS\\CAPGEMINI_JSWorkspace\\chromedriver.exe");
				driver = new ChromeDriver();
			    driver.get("http://realty-real-estatem1.upskills.in/my-profile/");
			}
			
			@When("User enter username and password")
			public void user_enter_username_and_password() {
				 try {
				    	Thread.sleep(3000);
				    	driver.findElement(By.id("user_login")).sendKeys("admin");
				    	driver.findElement(By.name("pwd")).sendKeys("admin@123");
				    }
				    catch(Exception e) {
				    	System.out.println("not able to enter credentials"+e);
				    	Assert.fail();
				    }
			  
			}
			
			@Then("user clicks on Login button")
			public void user_clicks_on_Login_button() {
				try {
			    	Thread.sleep(3000);
			    	driver.findElement(By.name("login")).click();
			    }
			    catch(Exception e) {
			    	System.out.println("not able to login"+e);
			    	Assert.fail();
			    }
			 
			}
			
			@And("User is redirected to the dashboard")
			public void user_is_redirected_to_the_dashboard() {
				try {
			    	 Thread.sleep(3000);
			         String expected ="Real Estate";
			    	String actual= driver.getTitle();
			    	if (actual.equals(expected)) {
						System.out.println("User is on the dashboard page");
					} else {
						System.out.println("User is not on the right page");
					}
			    }
			    catch(Exception e) {
			    	System.out.println(e);
			    	Assert.fail();
			}
			  
			}
			
			@Then("User navigates to the comment section")
			public void user_navigates_to_the_comment_section() {
				try {
					Thread.sleep(3000);
					WebElement obj = driver.findElement(By.xpath("//*[@id=\"menu-comments\"]/a/div[3]"));
					obj.click();
					
				} catch (Exception e) {
			    	System.out.println(e);
			    	Assert.fail();
				}
				
			    
             }
			
			

			@When("User clicks the search field")
			public void user_clicks_the_search_field() {
				try {
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\"comment-search-input\"]")).click();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			    
			
			
			@And("User enters the name{string}")
			public void user_enters_the_name(String string) {
				
					try {
						Thread.sleep(3000);
						driver.findElement(By.xpath("//*[@id=\"comment-search-input\"]")).sendKeys("bh");

					} catch (Exception e) {
						System.out.println(e);
					}
			}
					@Then("User clicks the search button")
					public void user_clicks_the_search_button1() {
						
						try {
							Thread.sleep(3000);
							driver.findElement(By.xpath("//*[@id=\"search-submit\"]")).click();

						} catch (Exception e) {
							System.out.println(e);
						}
					
}	

			

@When("User clicks the all comments dropdown list")
public void user_clicks_the_all_comments_dropdown_list() {
    // Write code here that turns the phrase above into concrete actions
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"filter-by-comment-type\"]")).click();
	} catch (Exception e) {
		System.out.println(e);
	}
}

@And("User enters any option{string} {string}")
public void user_enters_any_option(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"filter-by-comment-type\"]/option[2]")).sendKeys("comments");

	} catch (Exception e) {
		System.out.println(e);
	}
	
	
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"filter-by-comment-type\"]/option[3]")).sendKeys("pings");

	} catch (Exception e) {
		System.out.println(e);
	}
}


@Then("User clicks the filter button")
public void user_clicks_the_filter_button() {
    // Write code here that turns the phrase above into concrete actions
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"post-query-submit\"]")).click();

	} catch (Exception e) {
		System.out.println(e);
	}
} 


@When("User clicks the spam button")
public void user_clicks_the_spam_button() {
    // Write code here that turns the phrase above into concrete actions
   try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"comment-2342\"]/td[2]/div[3]/span[6]/a")).click();

	} catch (Exception e) {
		System.out.println(e);
	}
}  


@And("User is directed to the spam folder")
public void user_is_directed_to_the_spam_folder() {
    // Write code here that turns the phrase above into concrete actions
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[3]/ul/li[4]/a")).click();

	} catch (Exception e) {
		System.out.println(e);
	}
}

@Then("User clicks the not spam button")
public void user_clicks_the_not_spam_button() {
    // Write code here that turns the phrase above into concrete actions
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"comment-2336\"]/td[2]/div[3]/span[1]/a")).click();

	} catch (Exception e) {
		System.out.println(e);
	}
}

@Then("User clicks the delete permanently button")
public void user_clicks_the_delete_permanently_button() {
    // Write code here that turns the phrase above into concrete actions
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"comment-2336\"]/td[2]/div[3]/span[2]/a")).click();

	} catch (Exception e) {
		System.out.println(e);
	}
    
}
@When("User clicks the trash button")
public void user_clicks_the_trash_button() {
    // Write code here that turns the phrase above into concrete actions
   try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"comment-2330\"]/td[2]/div[3]/span[7]/a")).click();

	} catch (Exception e) {
		System.out.println(e);
	}
}  


@And("User is directed to the trash folder")
public void user_is_directed_to_the_trash_folder() {
    // Write code here that turns the phrase above into concrete actions
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[3]/ul/li[5]/a")).click();

	} catch (Exception e) {
		System.out.println(e);
	}
}

@Then("User clicks the spam button")
public void user_clicks_the_spam_button1() {
    // Write code here that turns the phrase above into concrete actions
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"comment-2342\"]/td[2]/div[3]/span[1]/a")).click();

	} catch (Exception e) {
		System.out.println(e);
	}
}
@Then("User clicks the restore button")
public void user_clicks_the_restore_button() {
    // Write code here that turns the phrase above into concrete actions
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"comment-2342\"]/td[2]/div[3]/span[2]/a")).click();

	} catch (Exception e) {
		System.out.println(e);
	}
}

@Then("User clicks the delete permanently button")
public void user_clicks_the_delete_permanently_button1() {
    // Write code here that turns the phrase above into concrete actions
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"comment-2342\"]/td[2]/div[3]/span[3]/a")).click();

	} catch (Exception e) {
		System.out.println(e);
	}
    
}
}

			/*@When("User selects checkbox of comment")
			public void user_selects_checkbox_of_comment() {
			    // Write code here that turns the phrase above into concrete actions
			    throw new cucumber.api.PendingException();
			}

			@Then("User selects bulk actions")
			public void user_selects_bulk_actions() {
			    // Write code here that turns the phrase above into concrete actions
			    throw new cucumber.api.PendingException();
			}

			@Then("User selects approve option{string}")
			public void user_selects_approve_option(String string) {
			    // Write code here that turns the phrase above into concrete actions
			    throw new cucumber.api.PendingException();
			}

			@Then("User selects apply button")
			public void user_selects_apply_button() {
			    // Write code here that turns the phrase above into concrete actions
			    throw new cucumber.api.PendingException();
			}


}

			/*@Then("User fetch the result")
			public void user_fetch_the_result() {
		
			}

}
@Then("Clicks the Affiliate Name field")
public void clicks_the_Affiliate_Name_field() {
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='input-name']")).click();
	} catch (Exception e) {
		System.out.println(e);
	}
}

@Then("Admin enters the name{string}")
public void admin_enters_the_name(String name) {
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='input-name']")).sendKeys(name);

	} catch (Exception e) {
		System.out.println(e);
	}
}

@Then("Admin clicks the filter button")
public void admin_clicks_the_filter_button() {
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='button-filter']")).click();

	} catch (Exception e) {
		System.out.println(e);
	}
}*/