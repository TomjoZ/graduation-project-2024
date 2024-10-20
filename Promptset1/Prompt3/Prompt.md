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

<header class="s-header">

    <div class="header-logo">
        <a class="site-logo" href="index.html">
            <img src="images/Metal-Complex-alb.svg" alt="Homepage">
        </a>
    </div>

    <nav class="header-nav">

        <h3>Navigati catre</h3>

        <div class="header-nav__content">

            <ul class="header-nav__list">
                <li><a
                        class="smoothscroll"
                        href="#home"
                        title="home"
                    >   Acasa
                    </a>
                </li>
                <li><a
                        class="smoothscroll"
                        href="#about"
                        title="about"
                    >   Despre Noi
                    </a>
                </li>
                <li><a
                        class="smoothscroll"
                        href="#services"
                        title="services"
                    >   Servicii
                    </a>
                </li>
                <li><a
                        class="smoothscroll"
                        href="#works"
                        title="works"
                    >   Portofoliu
                    </a>
                </li>
                <li><a
                        class="smoothscroll"
                        href="#contact"
                        title="contact"
                    >   Contact
                    </a>
                </li>
            </ul>

            <p>Procesul de tăiere a metalelor implică îndepărtarea excesului de material dintr-o piesă de prelucrat sub formă de cip folosind un instrument în formă de pană.</p>

            <ul class="header-nav__social">
                <li>
                    <a
                        href="https://www.facebook.com/pages/category/Industrial-Company/METAL-Complex-1566459686784510/"><i class="fab fa-facebook"></i></a>
                </li>
                <li>
                    <a href="#0"><i class="fab fa-twitter"></i></a>
                </li>
                <li>
                    <a href="https://www.instagram.com/accounts/login/?next=/metal_complex/"><i class="fab fa-instagram"></i></a>
                </li>
            </ul>

        </div>

    </nav>
</header>


<section id="home" class="s-home page-hero target-section" data-parallax="scroll" data-image-src="images/300.jpg" data-natural-width=3000 data-natural-height=2000 data-position-y=center>

    <div class="grid-overlay">
        <div></div>
    </div>

    <div class="home-content">

        <div class="row home-content__main">

            <h1>
            Metal Complex
            </h1>

            <h3>
            Nu urmați tendințele, stabiliți-le.
            </h3>

            <div class="home-content__video">
                <a
                    class="video-link"
                    href="https://player.vimeo.com/video/117310401?color=01aef0&title=0&byline=0&portrait=0"
                    data-lity
                >
                    <span
                        class="video-icon"
                    >
                    </span>
                    <span
                        class="video-text"
                    >   Vizionati
                    </span>
                </a>
            </div>

            <div class="home-content__button">
                <a
                    href="#about"
                    class="smoothscroll btn btn--primary btn--large"
                >
                    Mai multe despre noi
                </a>
                <a
                    href="#contact"
                    class="smoothscroll btn btn--large"
                >
                    Contactati-ne
                </a>
            </div>

        </div>

        <div class="home-content__scroll">
            <a href="#about"
                class="scroll-link smoothscroll"
            >
                Scroll
            </a>
        </div>

    </div>

    <ul class="home-social">
        <li>
            <a href="https://www.facebook.com/pages/category/Industrial-Company/METAL-Complex-1566459686784510/"><i class="fab fa-facebook-f" aria-hidden="true"></i><span>Facebook</span></a>
        </li>
        <li>
            <a href="#0"><i class="fab fa-twitter" aria-hidden="true"></i><span>Twitter</span></a>
        </li>
        <li>
            <a href="https://www.instagram.com/accounts/login/?next=/metal_complex/"><i class="fab fa-instagram" aria-hidden="true"></i><span>Instagram</span></a>
        </li>

    </ul>

</section>


<section id="about" class="s-about target-section">

    <div class="row section-header bit-narrow" data-aos="fade-up">
        <div class="col-full">
            <h3 class="subhead">Cine suntem</h3>
            <h1 class="display-1">
            Echipa noastră are o experiență combinată de peste 5 de ani în prelucrarea metalelor.
            </h1>
        </div>
    </div>

    <div class="row bit-narrow" data-aos="fade-up">
        <div class="col-full">
            <p class="lead">
                Această companie a început ca un hobby pasional și în curând a înflorit în ceva mult mai mult. Am avut parte de lupte echitabile,
                dar am predominat și acum ne cunoaștem drumul.
                Conducem compania cu conștiință, ca o familie și tratam angajații și clienții așa cum vrem noi să fim tratați. Suntem ambițiosi, facem lucrurile diferit.
                Ne trezim în fiecare zi, facem ceva care ne pasionează și incercam să ne îmbunătățim continuu. Nu urmați tendințele, stabiliți-le.
            </p>
        </div>
    </div>

    <div class="row bit-narrow">

        <div class="about-process process block-1-2 block-tab-full">

            <div class="col-block item-process" data-aos="fade-up">
                <div class="item-process__text">
                    <h4 class="item-title">Consiliere</h4>
                    <p>
                        Iti doresti ca proiectul de amenajare interioara sa fie 100% adaptat nevoilor tale? Profita
                        de serviciile de consultanta oferite de Metal Complex!
                    </p>
                </div>
            </div>
            <div class="col-block item-process" data-aos="fade-up">
                <div class="item-process__text">
                    <h4 class="item-title">Planificare buget</h4>
                    <p>
                        De cate ori nu ti s-a intamplat ca socoteala de la inceputul proiectului sa nu se potriveasca
                        cu cea de la final? Cu noi nu vei avea parte de surprize neplacute! Inainte de proiectare,
                        iti facem o estimare cat mai exacta a costurilor!
                    </p>
                </div>
            </div>
            <div class="col-block item-process" data-aos="fade-up">
                <div class="item-process__text">
                    <h4 class="item-title">Proiectare</h4>
                    <p>
                        In functie de dimensiunile spatiului pe care vrei sa-l reamenajezi, iti punem la dispozitie
                        servicii de proiectare 2D si 3D, astfel incat sa poti avea o viziune cat mai exacta asupra rezultatului final.
                    </p>
                </div>
            </div>
            <div class="col-block item-process" data-aos="fade-up">
                <div class="item-process__text">
                    <h4 class="item-title">Livrare si montaj </h4>
                    <p>
                        Echipele noastre de montaj se deplaseaza oriunde te-ai afla, transportul si montajul fiind incluse in pretul produsului
                    </p>
                </div>
            </div>

        </div>

    </div>

</section>


<section id='services' class="s-services target-section darker">

    <div class="row section-header bit-narrow" data-aos="fade-up">
        <div class="col-full">
            <h3 class="subhead">Ce facem</h3>
            <h1 class="display-1">
                Ne mândrim cu ceea ce facem. Serviciile noastre sunt concepute pentru a vă ajuta afacerea sau casa
                să iasă în evidență
            </h1>
        </div>
    </div>

    <div class="row bit-narrow services block-1-2 block-tab-full">

        <div class="col-block item-service" data-aos="fade-up">
            <div class="item-service__icon">
                <i class="icon-star"></i>
            </div>
            <div class="item-service__text">
                <h

3 class="item-title">Taierea cu plasma a metalului</h3>
                <p>Facilitatea noastra include o mașina de tăiat cu plasma de ultimă generație,
                care ne permite să oferim clienților noștri soluții interne complete.
                </p>
            </div>
        </div>

    </div>

</section>


<section id="works" class="s-works target-section">

    <div class="row section-header has-bottom-sep narrow target-section" data-aos="fade-up">
        <div class="col-full">
            <h3 class="subhead">Portofoliul nostru</h3>
            <h1 class="display-1">
            Creăm produse și experiențe pe care oamenii le iubesc. Consultați lucrările noastre recente.
            </h1>
        </div>
    </div>

    <div class="row masonry-wrap">
        <div class="masonry">
            <div class="masonry__brick" data-aos="fade-up">
                <div class="item-folio">

                    <div class="item-folio__thumb">
                        <a href="images/curcanu2.jpeg" class="thumb-link" title="Shutterbug" data-size="1050x700">
                            <img src="images/curcanu2.jpeg" width="580"
                                 srcset="images/curcanu2.jpeg 1x, images/curcanu2.jpeg 2x" alt="">
                        </a>
                    </div>

                    <div class="item-folio__text">
                        <h3 class="item-folio__title">
                            Shutterbug
                        </h3>
                        <p class="item-folio__cat">
                            Branding
                        </p>
                    </div>

                    <a href="https://www.behance.net/" class="item-folio__project-link" title="Project link">
                        <i class="icon-link"></i>
                    </a>

                    <div class="item-folio__caption">
                        <p>Vero molestiae sed aut natus excepturi. Et tempora numquam. Temporibus iusto quo.Unde dolorem corrupti neque nisi.</p>
                    </div>
                </div>
            </div>


        </div>

    </div>

</section>

<section id="about2" class="s-about target-section">

    <div class="row section-header bit-narrow" data-aos="fade-up">
        <div class="col-full">
            <h3 class="subhead">Cine suntem</h3>
            <h1 class="display-1">
            Echipa noastră are o experiență combinată de peste 5 de ani în prelucrarea metalelor.
            </h1>
        </div>
    </div>

    <div class="row bit-narrow" data-aos="fade-up">
        <div class="col-full">
            <p class="lead">
                Această companie a început ca un hobby pasional și în curând a înflorit în ceva mult mai mult. Am avut parte de lupte echitabile,
                dar am predominat și acum ne cunoaștem drumul.
                Conducem compania cu conștiință, ca o familie și tratam angajații și clienții așa cum vrem noi să fim tratați. Suntem ambițiosi, facem lucrurile diferit.
                Ne trezim în fiecare zi, facem ceva care ne pasionează și incercam să ne îmbunătățim continuu. Nu urmați tendințele, stabiliți-le.
            </p>
        </div>
    </div>
</section>

<section id="clients" class="s-clients target-section darker">
    <div class="grid-overlay">
        <div></div>
    </div>
    <div class="row section-header text-center narrow" data-aos="fade-up">
        <div class="col-full">
            <h3 class="subhead">Clientii nostri</h3>
            <h1 class="display-1">Metal Complex realizeaza, la cerere, numeroase elemente metalice personalizate, conform cerintelor tale.</h1>
        </div>
    </div>
    <div class="row clients-wrap" data-aos="fade-up">
        <div class="col-twelve">
            <ul class="clients">
                <li><a href="#0">Rafturi</a></li>
            </ul>
        </div>
    </div>

</section>


<section class="s-testimonials">

    <div class="testimonials__icon" data-aos="fade-up"></div>

    <div class="row testimonials narrow">

        <div class="col-full testimonials__slider" data-aos="fade-up">

            <div class="testimonials__slide">
                <p>Echipa noastră este pasionată de serviciile pentru clienți.Fie că sunt în calitate,
                administrare sau operațiuni, ne străduim cu toții să oferim soluții optime clienților noștri.
                </p>
                <div class="testimonials__author">
                    Alexandru Andrei
                    <span>Metal Complex</span>
                </div>
            </div>

        </div>

    </div>

</section>

<section id="contact" class="s-contact target-section">
        <div class="grid-overlay">
            <div></div>
        </div>
    <div class="row section-header narrow" data-aos="fade-up">
        <div class="col-full">
            <h3 class="subhead">Keep In Touch</h3>
            <h1 class="display-1">Nu ezitati sa ne contactati pentru orice <br> idee de proiect sau colaborare.</h1>
        </div>
    </div>

    <div class="row contact-main" data-aos="fade-up">
        <div class="col-full">
            <p class="contact-email">
                <a href="mailto:contact@metalcomplex.ro">contact@example.com</a>
            </p>
            <p class="contact-address">
            Aleea Teisani 125 <br>
            Sector 1, Bucuresti
            </p>
            <p class="contact-numbers">
            0721 617 118
            </p>
            <p>
                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d7012.802855800939!2d26.075809337785675!3d44.
                53618056909786!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x40b21ccaffff5ea5%3A0x25b6259d3c95de9b!2sAleea%20Tei%C8%99ani%20125%2C%20Bucure%C8%99ti!5e0!3m2!1sro!2sro!4v1610395996362!5m2!1sro!2sro"
                        width="800" height="500" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0">
                </iframe>
            </p>
            <ul class="contact-social">
                <li>
                    <a href="https://www.facebook.com/pages/category/Industrial-Company/METAL-Complex-1566459686784510/"><i class="fab fa-facebook"></i></a>
                </li>
                <li>
                    <a href="#0"><i class="fab fa-twitter"></i></a>
                </li>
                <li>
                    <a href="https://www.instagram.com/accounts/login/?next=/metal_complex/"><i class="fab fa-instagram"></i></a>
                </li>
            </ul>
        </div>
    </div>

</section>


<footer>
    <div class="ss-go-top">
        <a class="smoothscroll" title="Back to Top" href="#top">Reveniti la inceput</a>
    </div>
</footer>


