Objective:
Your objective is to attribute regular HTML with field type attributes and a unique field name (varName) according to a specific syntax for a  tool, that turns this into adobe experience manager CMS components, to understand it. You only return the new complate HTML, no further text.

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


regular HTML:
 <header id="header">
    <div class="container-fluid">

      <div id="logo" class="pull-left">
        <h1><a href="#intro" class="scrollto">BizPage</a></h1>
      </div>

      <nav id="nav-menu-container">
        <ul class="nav-menu">
          <li class="menu-active"><a href="#intro">Home</a></li>
          <li><a href="#about">About Us</a></li>
          <li><a href="#services">Services</a></li>
          <li><a href="#portfolio">Portfolio</a></li>
          <li><a href="#team">Team</a></li>
          <li class="menu-has-children"><a href="">Drop Down</a>
            <ul>
              <li><a href="#">Drop Down 1</a></li>
              <li><a href="#">Drop Down 3</a></li>
              <li><a href="#">Drop Down 4</a></li>
              <li><a href="#">Drop Down 5</a></li>
            </ul>
          </li>
          <li><a href="#contact">Contact</a></li>
        </ul>
      </nav><!-- #nav-menu-container -->
    </div>
  </header><!-- #header -->


  <section id="intro">
    <div class="intro-container">
      <div id="introCarousel" class="carousel  slide carousel-fade" data-ride="carousel">

        <ol class="carousel-indicators"></ol>

        <div class="carousel-inner" role="listbox">

        <div class="carousel-item active">
            <img src="img/intro-carousel/1.jpg" alt="Carousel Image 1" />
            <div class="carousel-container">
                <div class="carousel-content">
                    <h2>We are professional</h2>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                    <a href="#featured-services" class="btn-get-started scrollto">Get Started</a>
                </div>
            </div>
        </div>

        <div class="carousel-item">
            <img src="img/intro-carousel/2.jpg" alt="Carousel Image 2" />
            <div class="carousel-container">
                <div class="carousel-content">
                    <h2>At vero eos et accusamus</h2>
                    <p>Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. Temporibus autem quibusdam et aut officiis debitis aut.</p>
                    <a href="#featured-services" class="btn-get-started scrollto">Get Started</a>
                </div>
            </div>
        </div>

        <div class="carousel-item">
            <img src="img/intro-carousel/3.jpg" alt="Carousel Image 3" />
            <div class="carousel-container">
                <div class="carousel-content">
                    <h2>Temporibus autem quibusdam</h2>
                    <p>Beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt omnis iste natus error sit voluptatem accusantium.</p>
                    <a href="#featured-services" class="btn-get-started scrollto">Get Started</a>
                </div>
            </div>
        </div>


          <div class="carousel-item" style="background-image: url('img/intro-carousel/4.jpg');">
            <div class="carousel-container">
              <div class="carousel-content">
                <h2>Nam libero tempore</h2>
                <p>Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum.</p>
                <a href="#featured-services" class="btn-get-started scrollto">Get Started</a>
              </div>
            </div>
          </div>

          <div class="carousel-item" style="background-image: url('img/intro-carousel/5.jpg');">
            <div class="carousel-container">
              <div class="carousel-content">
                <h2>Magnam aliquam quaerat</h2>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                <a href="#featured-services" class="btn-get-started scrollto">Get Started</a>
              </div>
            </div>
          </div>

        </div>

        <a class="carousel-control-prev" href="#introCarousel" role="button" data-slide="prev">
          <span class="carousel-control-prev-icon ion-chevron-left" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>

        <a class="carousel-control-next" href="#introCarousel" role="button" data-slide="next">
          <span class="carousel-control-next-icon ion-chevron-right" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>

      </div>
    </div>
  </section>



