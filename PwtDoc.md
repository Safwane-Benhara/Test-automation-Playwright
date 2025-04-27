## Locators in Playwright-------------------(a class equivalent to Webelement in Selenium)
***  By  visible text content :       page.getByText("submit")   
***  By role and name (recommended): page.getByRole(AriaRole.BUTTON,  new GetByRoleOptions().setName("submit"))
***  By targeting html directly locator with filter has text.... :page.locator("div", new Locator.LocatorOptions().setHasText("xyz))

_ to get text : String text = page.locator("selector").innerText();
 >>  <button>=BUTTON  | <a> =LINK  | <input type="text">=TEXTBOX | <select>(drpdown)=COMBOBOX |<hx>=HEADING|<img>=IMG
 
>> locating multiple elemments

Locator rows =page.locator("table tr");
int len=rows.count();
locator second=rows.nth(1);

 
***  XPath  : page.locator("xpath=//div[@id='main']")
***  By test id : page.getByTestID("theID")

## Actions in playright--------------------(methods acting on locator objects)
button.click();
button.dblclick();
champ.fill("string text "");
button.hover();

>> Keyboard actions too:

page.keyboard().press("Enter");
page.keyboard().type("Helloworld123")

>>Mouse actions :

page.mouse().move(500,500);
page.mouse().click(500,500);
