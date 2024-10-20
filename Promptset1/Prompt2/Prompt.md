Objective:
Your objective is to attribute regular HTML with field type attributes and a unique field name (varName) according to a specific syntax for a  tool, that turns this into adobe experience manager CMS components, to understand it. You only return the new complete HTML, no further text.

Syntax:
Here is a list of all the attributes that are currently supported by the module: textfield-[VarName] textarea-[VarName] checkbox-[VarName] link-[VarName] img-[VarName] select-[VarName] description list-[VarName] The [VarName] placeholder represents the variable name you choose for the field and should be replaced by the actual name in your HTML.

1. textField
Add the textfield-[VarName] attribute to your header (h1,h2,h3 etc) tags, replacing [VarName] with your unique chosen field name.
HTML Original:<h1> Component Title </h1>
What module expects:<h1 textfield-title> Component Title </h1>

2. textarea
Add the textarea-[VarName] attribute to your paragraph tag, replacing [VarName] with your chosen field name. Use this for fields like descriptions.
HTML Original:<p> Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>
What module expects:<p textarea-message> Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>

3. checkbox
Look at context and assign checkbox attribute when necessary.
HTML Original:
<div>
    <p>Species: Human</p>
</div>
What module expects:
<div checkbox-check>
    <p>Species: Human</p>
</div>

4. link
Add the link-[VarName] attribute to your a tag, replacing [VarName] with your chosen field name.

HTML Original:
<a href="#">
    Click Here
</a>
What module expects:
<a link-linkToWebsite href="#">
    Click Here
</a>

5. img
Add the img-[VarName] attribute to your html tag, replacing [VarName] with your chosen field name.
HTML Original:
<img src="/banners/img1.png" alt="Img Description"/>
What module expects:
<img img-bannerImg src="/banners/img1.png" alt="Img Description"/>

6. description
The description requires the presence of another attribute from the list. Apply to every attributes tag.
HTML Original:
<p> Component Title </p>
What module expects:
<p textfield-title description="This field defines the component title"> Component Title </p>

textfield-title serves as an example and it can be as well e.g. img-varName , link-varName etc.



7. list-[VarName]
Add the list-[VarName] attribute to <ul> tag, replacing [VarName] with your chosen list name.
Only used in <ul> <li>.

HTML Original:
<ul>
    <li>
        <div>
            <h3>Margherita</h3>
        </div>
        <p>10.99 €</p>
    </li>
    <li>
        <div>
            <h3>Pepperoni</h3>
        </div>
        <a href="#">Click the link here!</a>
        <p>13.99 €</p>
    </li>
</ul>
What module expects:
<ul list-pizzas>
    <li>
        <div>
            <h3 textfield-title>Margherita</h3>
        </div>
        <p textfield-price>10.99 €</p>
    </li>
    <li>
        <div>
            <h3>Pepperoni</h3>
        </div>
        <a link-pizzaLink href="#">Click the link here!</a>
        <p>13.99 €</p>
    </li>
</ul>


Important:
1. [VarName] should be a unique name you create for each attribute, ensuring that each field is uniquely identifiable within the HTML structure. This helps avoid conflicts and ensures accurate mapping to Adobe Experience Manager components.
2. Return only the complete new html
3. Leave original HTML structure size in tact.


regular HTML:


<div class="super_container">
    <header class="header d-flex flex-row">
        <div class="header_content d-flex flex-row align-items-center">
            <!-- Logo -->
            <div class="logo_container">
                <div class="logo">
                    <img src="images/logo.png" alt="">
                    <span>course</span>
                </div>
            </div>

            <!-- Main Navigation -->
            <nav class="main_nav_container">
                <div class="main_nav">
                    <ul class="main_nav_list">
                        <li class="main_nav_item"><a href="index.html">home</a></li>
                        <li class="main_nav_item"><a href="#">about us</a></li>
                        <li class="main_nav_item"><a href="#">courses</a></li>
                        <li class="main_nav_item"><a href="elements.html">elements</a></li>
                        <li class="main_nav_item"><a href="news.html">news</a></li>
                        <li class="main_nav_item"><a href="contact.html">contact</a></li>
                    </ul>
                </div>
            </nav>
        </div>
        <div class="header_side d-flex flex-row justify-content-center align-items-center">
            <img src="images/phone-call.svg" alt="">
            <span>+43 4566 7788 2457</span>
        </div>

        <!-- Hamburger -->
        <div class="hamburger_container">
            <i class="fas fa-bars trans_200"></i>
        </div>

    </header>

    <!-- Menu -->
    <div class="menu_container menu_mm">

        <!-- Menu Close Button -->
        <div class="menu_close_container">
            <div class="menu_close"></div>
        </div>

        <!-- Menu Items -->
        <div class="menu_inner menu_mm">
            <div class="menu menu_mm">
                <ul class="menu_list menu_mm">
                    <li class="menu_item menu_mm"><a href="index.html">Home</a></li>
                    <li class="menu_item menu_mm"><a href="#">About us</a></li>
                    <li class="menu_item menu_mm"><a href="#">Courses</a></li>
                    <li class="menu_item menu_mm"><a href="elements.html">Elements</a></li>
                    <li class="menu_item menu_mm"><a href="news.html">News</a></li>
                    <li class="menu_item menu_mm"><a href="contact.html">Contact</a></li>
                </ul>

                <!-- Menu Social -->

                <div class="menu_social_container menu_mm">
                    <ul class="menu_social menu_mm">
                        <li class="menu_social_item menu_mm"><a href="#"><i class="fab fa-pinterest"></i></a></li>
                        <li class="menu_social_item menu_mm"><a href="#"><i class="fab fa-linkedin-in"></i></a></li>
                        <li class="menu_social_item menu_mm"><a href="#"><i class="fab fa-instagram"></i></a></li>
                        <li class="menu_social_item menu_mm"><a href="#"><i class="fab fa-facebook-f"></i></a></li>
                        <li class="menu_social_item menu_mm"><a href="#"><i class="fab fa-twitter"></i></a></li>
                    </ul>
                </div>

                <div class="menu_copyright menu_mm">Colorlib All rights reserved</div>
            </div>

        </div>

    </div>

    <!-- Home -->

    <div class="home">
        <div class="home_background_container prlx_parent">
            <div class="home_background prlx" style="background-image:url(images/courses_background.jpg)"></div>
        </div>
        <div class="home_content">
            <h1>Courses</h1>
        </div>
    </div>

    <!-- Popular -->

    <div class="popular page_section">
        <div class="container">
            <div class="row">
                <div class="col">
                    <div class="section_title text-center">
                        <h1>Popular Courses</h1>
                    </div>
                </div>
            </div>

            <div class="row course_boxes">

                <!-- Popular Course Item -->
                <div class="col-lg-4 course_box">
                    <div class="card">
                        <img class="card-img-top" src="images/course_1.jpg" alt="https://unsplash.com/@kellybrito">
                        <div class="card-body text-center">
                            <div class="card-title"><a href="courses.html">A complete guide to design</a></div>
                            <div class="card-text">Adobe Guide, Layes, Smart Objects etc...</div>
                        </div>
                        <div class="price_box d-flex flex-row align-items-center">
                            <div class="course_author_image">
                                <img src="images/author.jpg" alt="https://unsplash.com/@mehdizadeh">
                            </div>
                            <div class="course_author_name">Michael Smith, <span>Author</span></div>
                            <div class="course_price d-flex flex-column align-items-center justify-content-center"><span>$29</span></div>
                        </div>
                    </div>
                </div>

                <!-- Popular Course Item -->
                <div class="col-lg-4 course_box">
                    <div class="card">
                        <img class="card-img-top" src="images/course_2.jpg" alt="https://unsplash.com/@cikstefan">
                        <div class="card-body text-center">
                            <div class="card-title"><a href="courses.html">Beginners guide to HTML</a></div>
                            <div class="card-text">Adobe Guide, Layes, Smart Objects etc...</div>
                        </div>
                        <div class="price_box d-flex flex-row align-items-center">
                            <div class="course_author_image">
                                <img src="images/author.jpg" alt="https://unsplash.com/@mehdizadeh">
                            </div>
                            <div class="course_author_name">Michael Smith, <span>Author</span></div>
                            <div class="course_price d-flex flex-column align-items-center justify-content-center"><span>$29</span></div>
                        </div>
                    </div>
                </div>

                <!-- Popular Course Item -->
                <div class="col-lg-4 course_box">
                    <div class="card">
                        <img class="card-img-top" src="images/course_3.jpg" alt="https://unsplash.com/@dsmacinnes">
                        <div class="card-body text-center">
                            <div class="card-title"><a href="courses.html">Advanced Photoshop</a></div>
                            <div class="card-text">Adobe Guide, Layes, Smart Objects etc...</div>
                        </div>
                        <div class="price_box d-flex flex-row align-items-center">
                            <div class="course_author_image">
                                <img src="images/author.jpg" alt="https://unsplash.com/@mehdizadeh">
                            </div>
                            <div class="course_author_name">Michael Smith, <span>Author</span></div>
                            <div class="course_price d-flex flex-column align-items-center justify-content-center"><span>$29</span></div>
                        </div>
                    </div>
                </div>

                <!-- Popular Course Item -->
                <div class="col-lg-4 course_box">
                    <div class="card">
                        <img class="card-img-top" src="images/course_4.jpg" alt="https://unsplash.com/@kellitungay">
                        <div class="card-body text-center">
                            <div class="card-title"><a href="courses.html">A complete guide to design</a></div>
                            <div class="card-text">Adobe Guide, Layes, Smart Objects etc...</div>
                        </div>
                        <div class="price_box d-flex flex-row align-items-center">
                            <div class="course_author_image">
                                <img src="images/author.jpg" alt="https://unsplash.com/@mehdizadeh">
                            </div>
                            <div class="course_author_name">Michael Smith, <span>Author</span></div>
                            <div class="course_price d-flex flex-column align-items-center justify-content-center"><span>$29</span></div>
                        </div>
                    </div>
                </div>

                <!-- Popular Course Item -->
                <div class="col-lg-4 course_box">
                    <div class="card">
                        <img class="card-img-top" src="images/course_5.jpg" alt="https://unsplash.com/@claybanks1989">
                        <div class="card-body text-center">
                            <div class="card-title"><a href="courses.html">Beginners guide to HTML</a></div>
                            <div class="card-text">Adobe Guide, Layes, Smart Objects etc...</div>
                        </div>
                        <div class="price_box d-flex flex-row align-items-center">
                            <div class="course_author_image">
                                <img src="images/author.jpg" alt="https://unsplash.com/@mehdizadeh">
                            </div>
                            <div class="course_author_name">Michael Smith, <span>Author</span></div>
                            <div class="course_price d-flex flex-column align-items-center justify-content-center"><span>$29</span></div>
                        </div>
                    </div>
                </div>

                <!-- Popular Course Item -->
                <div class="col-lg-4 course_box">
                    <div class="card">
                        <img class="card-img-top" src="images/course_6.jpg" alt="https://unsplash.com/@element5digital">
                        <div class="card-body text-center">
                            <div class="card-title"><a href="courses.html">Advanced Photoshop</a></div>
                            <div class="card-text">Adobe Guide, Layes, Smart Objects etc...</div>
                        </div>
                        <div class="price_box d-flex flex-row align-items-center">
                            <div class="course_author_image">
                                <img src="images/author.jpg" alt="https://unsplash.com/@mehdizadeh">
                            </div>
                            <div class="course_author_name">Michael Smith, <span>Author</span></div>
                            <div class="course_price d-flex flex-column align-items-center justify-content-center"><span>$29</span></div>
                        </div>
                    </div>
                </div>

                <!-- Popular Course Item -->
                <div class="col-lg-4 course_box">
                    <div class="card">
                        <img class="card-img-top" src="images/course_7.jpg" alt="https://unsplash.com/@gaellemm">
                        <div class="card-body text-center">
                            <div class="card-title"><a href="courses.html">A complete guide to design</a></div>
                            <div class="card-text">Adobe Guide, Layes, Smart Objects etc...</div>
                        </div>
                        <div class="price_box d-flex flex-row align-items-center">
                            <div class="course_author_image">
                                <img src="images/author.jpg" alt="https://unsplash.com/@mehdizadeh">
                            </div>
                            <div class="course_author_name">Michael Smith, <span>Author</span></div>
                            <div class="course_price d-flex flex-column align-items-center justify-content-center"><span>$29</span></div>
                        </div>
                    </div>
                </div>

                <!-- Popular Course Item -->
                <div class="col-lg-4 course_box">
                    <div class="card">
                        <img class="card-img-top" src="images/course_8.jpg" alt="https://unsplash.com/@juanmramosjr">
                        <div class="card-body text-center">
                            <div class="card-title"><a href="courses.html">Beginners guide to HTML</a></div>
                            <div class="card-text">Adobe Guide, Layes, Smart Objects etc...</div>
                        </div>
                        <div class="price_box d-flex flex-row align-items-center">
                            <div class="course_author_image">
                                <img src="images/author.jpg" alt="https://unsplash.com/@mehdizadeh">
                            </div>
                            <div class="course_author_name">Michael Smith, <span>Author</span></div>
                            <div class="course_price d-flex flex-column align-items-center justify-content-center"><span>$29</span></div>
                        </div>
                    </div>
                </div>

                <!-- Popular Course Item -->
                <div class="col-lg-4 course_box">
                    <div class="card">
                        <img class="card-img-top" src="images/course_9.jpg" alt="https://unsplash.com/@kimberlyfarmer">
                        <div class="card-body text-center">
                            <div class="card-title"><a href="courses.html">Advanced Photoshop</a></div>
                            <div class="card-text">Adobe Guide, Layes, Smart Objects etc...</div>
                        </div>
                        <div class="price_box d-flex flex-row align-items-center">
                            <div class="course_author_image">
                                <img src="images/author.jpg" alt="https://unsplash.com/@mehdizadeh">
                            </div>
                            <div class="course_author_name">Michael Smith, <span>Author</span></div>
                            <div class="course_price d-flex flex-column align-items-center justify-content-center"><span>$29</span></div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>
    <footer class="footer">
        <div class="container">
            <div class="newsletter">
                <div class="row">
                    <div class="col">
                        <div class="section_title text-center">
                            <h1>Subscribe to newsletter</h1>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col text-center">
                        <div class="newsletter_form_container mx-auto">
                            <form action="post">
                                <div class="newsletter_form d-flex flex-md-row flex-column flex-xs-column align-items-center justify-content-center">
                                    <input id="newsletter_email" class="newsletter_email" type="email" placeholder="Email Address" required="required" data-error="Valid email is required.">
                                    <button id="newsletter_submit" type="submit" class="newsletter_submit_btn trans_300" value="Submit">Subscribe</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <div class="footer_content">
                <div class="row">
                    <div class="col-lg-3 footer_col">
                        <div class="logo_container">
                            <div class="logo">
                                <img src="images/logo.png" alt="">
                                <span>course</span>
                            </div>
                        </div>
                        <p class="footer_about_text">In aliquam, augue a gravida rutrum, ante nisl fermentum nulla, vitae tempor nisl ligula vel nunc. Proin quis mi malesuada, finibus tortor fermentum, tempor lacus.</p>
                    </div>
                    <div class="col-lg-3 footer_col">
                        <div class="footer_column_title">Menu</div>
                        <div class="footer_column_content">
                            <ul>
                                <li class="footer_list_item"><a href="index.html">Home</a></li>
                                <li class="footer_list_item"><a href="#">About Us</a></li>
                                <li class="footer_list_item"><a href="#">Courses</a></li>
                                <li class="footer_list_item"><a href="news.html">News</a></li>
                                <li class="footer_list_item"><a href="contact.html">Contact</a></li>
                            </ul>
                        </div>
                    </div>
                    <!-- Footer Column - Usefull Links -->
                    <div class="col-lg-3 footer_col">
                        <div class="footer_column_title">Usefull Links</div>
                        <div class="footer_column_content">
                            <ul>
                                <li class="footer_list_item"><a href="#">Testimonials</a></li>
                                <li class="footer_list_item"><a href="#">FAQ</a></li>
                                <li class="footer_list_item"><a href="#">Community</a></li>
                                <li class="footer_list_item"><a href="#">Campus Pictures</a></li>
                                <li class="footer_list_item"><a href="#">Tuitions</a></li>
                            </ul>
                        </div>
                    </div>
                    <!-- Footer Column - Contact -->
                    <div class="col-lg-3 footer_col">
                        <div class="footer_column_title">Contact</div>
                        <div class="footer_column_content">
                            <ul>
                                <li class="footer_contact_item">
                                    <div class="footer_contact_icon">
                                        <img src="images/placeholder.svg" alt="https://www.flaticon.com/authors/lucy-g">
                                    </div>
                                    Blvd Libertad, 34 m05200 Arévalo
                                </li>
                                <li class="footer_contact_item">
                                    <div class="footer_contact_icon">
                                        <img src="images/smartphone.svg" alt="https://www.flaticon.com/authors/lucy-g">
                                    </div>
                                    0034 37483 2445 322
                                </li>
                                <li class="footer_contact_item">
                                    <div class="footer_contact_icon">
                                        <img src="images/envelope.svg" alt="https://www.flaticon.com/authors/lucy-g">
                                    </div>hello@company.com
                                </li>
                            </ul>
                        </div>
                    </div>

                </div>
            </div>
            <div class="footer_bar d-flex flex-column flex-sm-row align-items-center">
                <div class="footer_copyright">
                    <p class="footer_about_text">In aliquam, augue a gravida rutrum, ante nisl fermentum nulla, vitae tempor nisl ligula vel nunc. Proin quis mi malesuada, finibus tortor fermentum, tempor lacus.</p>
                </div>
                <div class="subscription_options">
                    <div>
                        <p>Preferences:</p>
                        <div>
                            <p>Email Updates: Enabled</p>
                        </div>
                        <div>
                            <p>SMS Notifications: Disabled</p>
                        </div>
                    </div>
                </div>
                <div class="footer_social ml-sm-auto">
                    <ul class="menu_social">
                        <li class="menu_social_item"><a href="#"><i class="fab fa-pinterest"></i></a></li>
                        <li class="menu_social_item"><a href="#"><i class="fab fa-linkedin-in"></i></a></li>
                        <li class="menu_social_item"><a href="#"><i class="fab fa-instagram"></i></a></li>
                        <li class="menu_social_item"><a href="#"><i class="fab fa-facebook-f"></i></a></li>
                        <li class="menu_social_item"><a href="#"><i class="fab fa-twitter"></i></a></li>
                    </ul>
                </div>
            </div>

        </div>
    </footer>
</div>



