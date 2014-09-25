<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="facebook" tagdir="/WEB-INF/tags/facebook" %>
<div class="jumbotron index-banner">
  <div class="container">
    <h1>Web Stories</h1>
    <p class="index-banner-paragraph">
      Uma plataforma para publicação de histórias na Web
    </p>
    <p>
      <c:if test="${canPublish}">
        <facebook:login className="btn btn-primary btn-lg" invite="${param.invite}">
          Publique a sua história
        </facebook:login>
      </c:if>
    </p>
    <c:if test="${!canPublish}">
      <p class="index-banner-closed">
        Web Stories atualmente está em um beta fechado.
        <br>
        <span class="index-banner-contact">Clique aqui para solicitar um convite</span>
      </p>
    </c:if>
  </div>
</div>
<div class="container">
  <div class="row">
    <div class="col-sm-6 col-md-4">
      <div class="thumbnail index-story-thumb">
        <a href="#">
          <img src="http://placehold.it/800x300" alt="história">
        </a>
        <div class="caption">
          <div class="media">
            <a class="pull-left" href="#">
              <img alt="Placeholder" src="http://placehold.it/60x60" class="media-object">
            </a>
            <div class="media-body">
              <a class="text-ellipsis" href="#">
                A Fábula
              </a>
              <p class="text-ellipsis index-story-thumb-summary">
                Uma fábula perdida no continuum do espaço-tempo
              </p>
              <div class="text-ellipsis text-muted">
                por <cite>Fernando Fernandes</cite>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="col-sm-6 col-md-4">
      <div class="thumbnail index-story-thumb">
        <a href="#">
          <img src="http://placehold.it/800x300" alt="história">
        </a>
        <div class="caption">
          <div class="media">
            <a href="#" class="pull-left">
              <img alt="Placeholder" src="http://placehold.it/60x60" class="media-object">
            </a>
            <div class="media-body">
              <a class="text-ellipsis" href="#">
                O Monstro
              </a>
              <p class="text-ellipsis index-story-thumb-summary">
                Um monstro buscando o significado para a vida
              </p>
              <div class="text-ellipsis text-muted">
                por <cite>Mariana Gonçalves</cite>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="col-sm-6 col-md-4">
      <div class="thumbnail index-story-thumb">
        <a href="#">
          <img src="http://placehold.it/800x300" alt="história">
        </a>
        <div class="caption">
          <div class="media">
            <a href="#" class="pull-left">
              <img alt="Placeholder" src="http://placehold.it/60x60" class="media-object">
            </a>
            <div class="media-body">
              <a class="text-ellipsis" href="#">
                A Saga da Sétima Pedra
              </a>
              <p class="text-ellipsis index-story-thumb-summary">
                Uma busca incansável para desvendar a imortalidade
              </p>
              <div class="text-ellipsis text-muted">
                por <cite>Carlos Cardoso</cite>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="col-sm-6 col-md-4 hidden-md hidden-lg">
      <div class="thumbnail index-story-thumb">
        <a href="#">
          <img src="http://placehold.it/800x300" alt="história">
        </a>
        <div class="caption">
          <div class="media">
            <a href="#" class="pull-left">
              <img alt="Placeholder" src="http://placehold.it/60x60" class="media-object">
            </a>
            <div class="media-body">
              <a class="text-ellipsis" href="#">
                O Homem Que Não Falava
              </a>
              <p class="text-ellipsis index-story-thumb-summary">
                Uma pessoa mostra uma forma diferente de se comunicar
              </p>
              <div class="text-ellipsis text-muted">
                por <cite>João Pereira</cite>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>