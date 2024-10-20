Objective:
Your objective is to attribute regular HTML with field type attributes and a unique field name (varName) according to a specific syntax for a  tool, that turns this into adobe experience manager CMS components, to understand it. You only return the new complete HTML, no further text.

Syntax:
Here is a list of all the attributes that are currently supported by the module: textfield-[VarName] textarea-[VarName] checkbox-[VarName] link-[VarName] img-[VarName] select-[VarName] description="" list-[VarName] The [VarName] placeholder represents the variable name you choose for the field and should be replaced by the actual name in your HTML.

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
3. Leave original HTML structure and size intact. Do not shorten it.
4. Every element you attribute, must have a description.


regular HTML:
<header class="ud-header">
  <div class="container">
    <div class="row">
      <div class="col-lg-12">
        <nav class="navbar navbar-expand-lg">
        <img src="assets/images/logo/logo.svg" alt="Logo" />

          <div class="navbar-collapse">
            <ul id="nav" class="navbar-nav mx-auto">
              <li class="nav-item">
                <a class="ud-menu-scroll">Home</a>
              </li>

              <li class="nav-item">
                <a class="ud-menu-scroll">About</a>
              </li>
              <li class="nav-item">
                <a class="ud-menu-scroll">Pricing</a>
              </li>
              <li class="nav-item">
                <a class="ud-menu-scroll">Team</a>
              </li>
              <li class="nav-item">
                <a class="ud-menu-scroll">Contact</a>
              </li>
            </ul>
          </div>

          <div class="navbar-btn d-none d-sm-inline-block">
            <a href="login.html" class="ud-main-btn ud-login-btn">
              Sign In
            </a>
            <a class="ud-main-btn ud-white-btn" href="javascript:void(0)">
              Sign Up
            </a>
          </div>
        </nav>
      </div>
    </div>
  </div>
</header>
<section class="ud-hero" id="home">
  <div class="container">
    <div class="row">
      <div class="col-lg-12">
        <div class="ud-hero-content wow fadeInUp" data-wow-delay=".2s">
            <p class="ud-hero-taf">
                #1 solution
            </p>
          <h1 class="ud-hero-title">
            Open-Source Web Template for SaaS, Startup, Apps, and More
          </h1>
          <p class="ud-hero-desc">
            Multidisciplinary Web Template Built with Your Favourite
            Technology - HTML Bootstrap, Tailwind and React NextJS.
          </p>
        </div>
      </div>
    </div>
  </div>
</section>
<section id="features" class="ud-features">
  <div class="container">
    <div class="row">
      <div class="col-lg-12">
        <div class="ud-section-title">
          <h2>Features</h2>
          <p>
            There are many variations of passages of Lorem Ipsum available
            but the majority have suffered alteration in some form.
          </p>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-xl-3 col-lg-3 col-sm-6">
        <div class="ud-single-feature wow fadeInUp" data-wow-delay=".1s">
          <div class="ud-feature-icon">
            <i class="lni lni-gift"></i>
          </div>
          <div class="ud-feature-content">
            <h3 class="ud-feature-title">Free and Open-Source</h3>
            <p class="ud-feature-desc">
              Lorem Ipsum is simply dummy text of the printing and industry.
            </p>
            <a href="javascript:void(0)" class="ud-feature-link">
              Learn More
            </a>
          </div>
        </div>
      </div>
      <div class="col-xl-3 col-lg-3 col-sm-6">
        <div class="ud-single-feature wow fadeInUp" data-wow-delay=".15s">
          <div class="ud-feature-icon">
            <i class="lni lni-move"></i>
          </div>
          <div class="ud-feature-content">
            <h3 class="ud-feature-title">Multipurpose Template</h3>
            <p class="ud-feature-desc">
              Lorem Ipsum is simply dummy text of the printing and industry.
            </p>
            <a href="javascript:void(0)" class="ud-feature-link">
              Learn More
            </a>
          </div>
        </div>
      </div>
      <div class="col-xl-3 col-lg-3 col-sm-6">
        <div class="ud-single-feature wow fadeInUp" data-wow-delay=".2s">
          <div class="ud-feature-icon">
            <i class="lni lni-layout"></i>
          </div>
          <div class="ud-feature-content">
            <h3 class="ud-feature-title">High-quality Design</h3>
            <p class="ud-feature-desc">
              Lorem Ipsum is simply dummy text of the printing and industry.
            </p>
            <a href="javascript:void(0)" class="ud-feature-link">
              Learn More
            </a>
          </div>
        </div>
      </div>
      <div class="col-xl-3 col-lg-3 col-sm-6">
        <div class="ud-single-feature wow fadeInUp" data-wow-delay=".25s">
          <div class="ud-feature-icon">
            <i class="lni lni-layers"></i>
          </div>
          <div class="ud-feature-content">
            <h3 class="ud-feature-title">All Essential Elements</h3>
            <p class="ud-feature-desc">
              Lorem Ipsum is simply dummy text of the printing and industry.
            </p>
            <a href="javascript:void(0)" class="ud-feature-link">
              Learn More
            </a>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
<section id="about" class="ud-about">
  <div class="container">
    <div class="ud-about-wrapper wow fadeInUp" data-wow-delay=".2s">
      <div class="ud-about-content-wrapper">
        <div class="ud-about-content">
          <span class="tag">About Us</span>
          <h2>Brilliant Toolkit to Build Nextgen Website Faster.</h2>
          <p>
            The main ‘thrust’ is to focus on educating attendees on how to
            best protect highly vulnerable business applications with
            interactive panel discussions and roundtables led by subject
            matter experts.
          </p>

          <span>
            The main ‘thrust’ is to focus on educating attendees on how to
            best protect highly vulnerable business applications with
            interactive panel.
          </span>
          <a class="ud-main-btn">Learn More</a>
        </div>
      </div>
      <div class="ud-about-image">
        <img src="assets/images/about/about-image.svg" alt="about-image" />
      </div>
    </div>
  </div>
</section>
<section id="newsletter" class="ud-newsletter">
  <div class="container">
    <div class="ud-newsletter-wrapper wow fadeInUp" data-wow-delay=".2s">
      <div class="ud-newsletter-content-wrapper">
        <div class="ud-newsletter-content">
          <span class="tag">Stay up to date</span>
          <h2>Subscribe to our newsletters</h2>
          <p>
            Select your newsletter options below;
          </p>
          <div>
              <p>Options: Newsletters</p>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
<section id="team" class="ud-team">
  <div class="container">
    <div class="row">
      <div class="col-lg-12">
        <div class="ud-section-title mx-auto text-center">
          <span>Our Team</span>
          <h2>Meet The Team</h2>
          <p>
            There are many variations of passages of Lorem Ipsum available
            but the majority have suffered alteration in some form.
          </p>
        </div>
      </div>
    </div>

    <ul class="team-list">
      <li>
        <div class="ud-single-team wow fadeInUp" data-wow-delay=".1s">
          <div class="ud-team-image-wrapper">
            <div class="ud-team-image">
              <img src="assets/images/team/team-01.png" alt="team" />
            </div>

            <img
              src="assets/images/team/dotted-shape.svg"
              alt="shape"
              class="shape shape-1"
            />

          </div>
          <div class="ud-team-info">
            <h5>Adveen Desuza</h5>
            <h6>UI Designer</h6>
          </div>
        </div>
      </li>
      <li>
          <div class="ud-single-team wow fadeInUp" data-wow-delay=".1s">
            <div class="ud-team-image-wrapper">
              <div class="ud-team-image">
                <img src="assets/images/team/team-02.png" />
              </div>

              <img
                src="assets/images/team/dotted-shape.svg"
                class="shape shape-1"
              />

            </div>
            <div class="ud-team-info">
              <h5>John Doe</h5>
              <h6>Frontend Developer</h6>
            </div>
          </div>
        </li>
      <li>
        <div class="ud-single-team wow fadeInUp" data-wow-delay=".1s">
          <div class="ud-team-image-wrapper">
            <div class="ud-team-image">
              <img src="assets/images/team/team-02.png" />
            </div>

            <img
              src="assets/images/team/dotted-shape.svg"
              class="shape shape-1"
            />

          </div>
          <div class="ud-team-info">
            <h5>Sarah Doe</h5>
            <h6>Backend Developer</h6>
          </div>
        </div>
      </li>
    </ul>
  </div>
</section>
