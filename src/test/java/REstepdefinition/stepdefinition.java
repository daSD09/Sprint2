package REstepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import hooks.hooksclass;

public class stepdefinition {
	
	
	
	//WebDriver driver = hooksclass.driver;
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
				    	driver.findElement(By.id("user_login")).sendKeys("mohankrishna176@gmail.com");
				    	driver.findElement(By.name("pwd")).sendKeys("Secret@123&&");
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
						System.out.println("User is on the right page");
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
			
			
//searchfunction
			@When("User clicks the search field")
			public void user_clicks_the_search_field() {
				try {
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\"comment-search-input\"]")).click();
				} catch (Exception e) {
					System.out.println(e);
					Assert.fail();
				}
			}
			    
			
			
			@And("User enters the name{string}")
			public void user_enters_the_name(String string) {
				
					try {
						Thread.sleep(3000);
						driver.findElement(By.xpath("//*[@id=\"comment-search-input\"]")).sendKeys("bh");

					} catch (Exception e) {
						System.out.println(e);
						Assert.fail();
					}
					/*try {
						Thread.sleep(3000);
						driver.findElement(By.xpath("//*[@id=\"comment-search-input\"]")).sendKeys("yash@gmail.com");

					} catch (Exception e) {
						System.out.println(e);
						Assert.fail();
					}*/
			}
					@Then("User clicks the search button")
					public void user_clicks_the_search_button1() {
						
						try {
							Thread.sleep(3000);
							driver.findElement(By.xpath("//*[@id=\"search-submit\"]")).click();

						} catch (Exception e) {
							System.out.println(e);
							Assert.fail();
						}
					
}	

			
//filterfunction
@When("User clicks the all comments type field")
public void user_clicks_the_all_comments_type_field() {
    // Write code here that turns the phrase above into concrete actions
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"filter-by-comment-type\"]")).click();
	} catch (Exception e) {
		System.out.println(e);
		Assert.fail();
	}
}

@Then("User selects any of one commenttype{string}")
public void user_selects_any_of_one_commenttype(String commenttype)  {
    // Write code here that turns the phrase above into concrete actions
	try {
		//driver.findElement(By.id("input-approved")).click();
		Select s = new Select(driver.findElement(By.xpath("//*[@id=\"filter-by-comment-type\"]")));
		Thread.sleep(1000);
		if (commenttype.equalsIgnoreCase("comments") || commenttype.equalsIgnoreCase("pings")) {
			s.selectByVisibleText(commenttype);
		} else {
			System.out.println("Wrong input");
			Assert.fail();
		}
	} catch (Exception e) {
		System.out.println("Exception Message:"+e);
		Assert.fail();
	}
}



@Then("User clicks the filter button")
public void user_clicks_the_filter_button() {
    // Write code here that turns the phrase above into concrete actions
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"post-query-submit\"]")).click();
		System.out.println("Filter function works");


	} catch (Exception e) {
		System.out.println("Filter function fails"+e);
		Assert.fail();
	}
}

//bulkfunction
@When("User clicks bulk functions field")
public void user_clicks_bulk_functions_field() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	 try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("")).click();


		} catch (Exception e) {
			System.out.println(e);
			Assert.fail();
		}
}
@Then("User selects any of one bulkoptions{string}")
public void user_selects_any_of_one_option(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

//spamfunction
@When("User clicks the spam button")
public void user_clicks_the_spam_button() {
    // Write code here that turns the phrase above into concrete actions
   try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"comment-2342\"]/td[2]/div[3]/span[6]")).click();


	} catch (Exception e) {
		System.out.println(e);
		Assert.fail();
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
		Assert.fail();
	}
}

//not spam button
@Then("User selects any of one spamoptions{string}")
public void user_selects_any_of_one_options(String spamoptions )  {
    // Write code here that turns the phrase above into concrete actions
	try {
		//driver.findElement(By.id("input-approved")).click();
		Select s = new Select(driver.findElement(By.xpath("//*[@id=\"comment-2330\"]/td[2]/div[3]/span[6]/a")));
		Thread.sleep(1000);
		if (spamoptions.equalsIgnoreCase("not spam") || spamoptions.equalsIgnoreCase("delete permanently")) {
			s.selectByVisibleText(spamoptions);
		} else {
			System.out.println("Wrong input");
			Assert.fail();
		}
	} catch (Exception e) {
		System.out.println("Exception Message:"+e);
		Assert.fail();
	}
}

	
	


/*@Then("User  enters any option4{string} {string}")
public void user_enters_any_option4(String string, String string3) {
    // Write code here that turns the phrase above into concrete actions
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"comment-2344\"]/td[2]/div[3]/span[2]/a")).sendKeys("delete permanently");

	} catch (Exception e) {
		System.out.println(e);
		Assert.fail();
	}
    
}*/



//trashfunction
@When("User clicks the trash button")
public void user_clicks_the_trash_button() {
    // Write code here that turns the phrase above into concrete actions
   try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"comment-2342\"]/td[2]/div[3]/span[7]")).click();


	} catch (Exception e) {
		System.out.println(e);
		Assert.fail();
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
		Assert.fail();
	}
}

@Then("User  enters any option5{string} {string}")
public void user_enters_any_option5(String string, String string3) {
    // Write code here that turns the phrase above into concrete actions
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"comment-2344\"]/td[2]/div[3]/span[2]/a")).sendKeys("spam");

	} catch (Exception e) {
		System.out.println(e);
		Assert.fail();
	}
}


@Then("User  enters any option7{string} {string}")
public void user_enters_any_option7(String string, String string3) {
    // Write code here that turns the phrase above into concrete actions
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"comment-2340\"]/td[2]/div[3]/span[3]/a")).sendKeys("delete permanently");

	} catch (Exception e) {
		System.out.println(e);
		Assert.fail();
	}
    
}

@Then("^User enters any option \"([^\"]*)\"$")
public void userEntersAnyOption(String arg) throws Throwable {
	throw new PendingException();
}

@Then("^User enters any option1 \"([^\"]*)\"$")
public void userEntersAnyOption1(String arg1) throws Throwable {
	throw new PendingException();
}


//edit_function
@When("User clicks edit button")
public void user_clicks_edit_button() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"comment-2345\"]/td[2]/div[3]/span[5]")).click();

	} catch (Exception e) {
		System.out.println(e);
	}
}


@Then("User is directed to the edit comment box")
public void user_is_directed_to_the_edit_comment_box() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	try {
		Thread.sleep(3000);
		WebElement obj = driver.findElement(By.xpath("//*[@id=\"post\"]/div/h1"));
		obj.click();
		
	} catch (Exception e) {
    	System.out.println(e);
    	Assert.fail();
	
}
}

@Then("User selects the text to be editted")
public void user_selects_the_text_to_be_editted() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"content\"]")).click();

	} catch (Exception e) {
		System.out.println(e);
		Assert.fail();
	}
}

@Then("User selects any option <bold>")
public void user_selects_any_optionitalics() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"qt_content_strong\"]")).click();

	} catch (Exception e) {
		System.out.println(e);
		Assert.fail();
	}
}

@Then("User selects any option<italics>")
public void user_selects_any_option_italics() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"qt_content_em\"]")).click();

	} catch (Exception e) {
		System.out.println(e);
		Assert.fail();
	}
}

@Then("User selects update button")
public void user_selects_update_button() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"save\"]")).click();

	} catch (Exception e) {
		System.out.println(e);
		Assert.fail();
	}
}


//quickedit_function
@When("User clicks quick edit button")
public void user_clicks_quick_edit_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("User is directed to quick edit comment box")
public void user_is_directed_to_quick_edit_comment_box() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("User selects the text to be editted2")
public void user_selects_the_text_to_be_editted2() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("User selects update comment option")
public void user_selects_update_comment_option() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("User clicks reply button")
public void user_clicks_reply_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("User is directed to reply to comment box")
public void user_is_directed_to_reply_to_comment_box() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("User types the reply bold")
public void user_types_the_reply_bold() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("User selects any option<bold>")
public void user_selects_any_option_bold() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("User selects reply option")
public void user_selects_reply_option() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("User types the reply italics")
public void user_types_the_reply_italics() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}
}


//bulkfunctionality
/*@When("User selects multiple checkboxes ")
public void user_selects_multiple_checkboxes() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.id("cb-select-1801")).click();
	driver.findElement(By.id("cb-select-1801")).isSelected();
	driver.findElement(By.id("cb-select-1784")).click();
	driver.findElement(By.id("cb-select-1784")).isSelected();
}

@Then("User clicks on bulk actions")
public void user_clicks_on_bulk_actions_of_tags() {
	try {
		driver.findElement(By.id("bulk-action-selector-top")).click(); 
	
    
	}
	catch(Exception e) {
		System.out.println("not able to click"+e);
		//Assert.fail();
	}
}

@Then("User selects approve option in  bulk functionality{string}")
public void user_selects_approve_option_in_tags_bulk_functionality(String string) {
	Select bulkobj = new Select(driver.findElement(By.id("bulk-action-selector-top")));
	bulkobj.selectByIndex(1);
}

@Then("User clicks on apply button ")
public void user_clicks_on_apply_button() {
	try {
		Thread.sleep(3000);
		driver.findElement(By.id("doaction")).click(); 
	
    
	}
	catch(Exception e) {
		System.out.println("not able to click"+e);
		//Assert.fail();
	} 
}
}
			/*@When("User selects multiple checkbox of comment")
						    
			    //throw new cucumber.api.PendingException();
				public void user_selects_multiple_checkboxes_of_tags() throws InterruptedException {
					Thread.sleep(3000);
					driver.findElement(By.id("cb-select-2342")).click();
					driver.findElement(By.id("cb-select-2342")).isSelected();
					driver.findElement(By.id("cb-select-2330")).click();
					driver.findElement(By.id("cb-select-2330")).isSelected();
				}
			

			@Then("User selects bulk actions")
			public void user_selects_bulk_actions() {
			    // Write code here that turns the phrase above into concrete actions
			    //throw new cucumber.api.PendingException();
				try {
					driver.findElement(By.id("bulk-action-selector-top")).click(); 
				
			    
				}
				catch(Exception e) {
					System.out.println("not able to click"+e);
				     Assert.fail();
				}
			}
}
/*
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

			



/*@Then("Admin clicks the filter button")
public void admin_clicks_the_filter_button() {
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='button-filter']")).click();

	} catch (Exception e) {
		System.out.println(e);
	}
}

*@When("User clicks on tags option")
	public void user_clicks_on_tags_option() {
		try {
			driver.findElement(By.xpath("//*[@id=\"menu-posts\"]/ul/li[5]/a")).click(); 
			 System.out.println("clicked on tags");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		}
	}

	@When("User selects multiple checkboxes of tags")
	public void user_selects_multiple_checkboxes_of_tags() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("cb-select-1801")).click();
		boolean result = driver.findElement(By.id("cb-select-1801")).isSelected();
		driver.findElement(By.id("cb-select-1784")).click();
		boolean result2 = driver.findElement(By.id("cb-select-1784")).isSelected();
	}

	@Then("User clicks on bulk actions of tags")
	public void user_clicks_on_bulk_actions_of_tags() {
		try {
			driver.findElement(By.id("bulk-action-selector-top")).click(); 
		
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		}
	}

	@Then("User selects delete option in tags bulk functionality{string}")
	public void user_selects_delete_option_in_tags_bulk_functionality(String string) {
		Select bulkobj = new Select(driver.findElement(By.id("bulk-action-selector-top")));
		bulkobj.selectByIndex(1);
	}

	@Then("User clicks on apply button in tags section")
	public void user_clicks_on_apply_button_in_tags_section() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("doaction")).click(); 
		
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		} 
		
		
//filterfunction
@When("User clicks the all comments type field")
public void user_clicks_the_all_comments_type_field() {
    // Write code here that turns the phrase above into concrete actions
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"filter-by-comment-type\"]")).click();
	} catch (Exception e) {
		System.out.println(e);
		Assert.fail();
	}
}

@Then("User selects any of one option{string}")
public void user_enters_any_option(String com, String pin) {
    // Write code here that turns the phrase above into concrete actions
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"filter-by-comment-type\"]/option[2]")).sendKeys("com");
		
		

	} catch (Exception e) {
		System.out.println(e);
		Assert.fail();
	}
}
	@Then("User enters any option2{string} {string}")
	public void user_enters_any_option2(String string, String string2) {	
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"filter-by-comment-type\"]/option[3]")).sendKeys("pings");

	} catch (Exception e) {
		System.out.println(e);
		Assert.fail();
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
		Assert.fail();
	}
} 

	}*/