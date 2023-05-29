<nav class="navbar navbar-expand-lg bg-light" style="border-bottom: 1px solid rgb(149, 149, 149);">
    <div class="container-fluid">
      <a class="navbar-brand" href="{{ route('trips.index') }}">Wycieczki górskie</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <a class="nav-link" href="#start">Start</a>
          </li>
          <li class="nav-item">
              <a class="nav-link" href="#wycieczki">Wycieczki</a>
          </li>
          <li class="nav-item">
              <a class="nav-link" href="#cennik">Cenniki</a>
          </li>
          <li class="nav-item">
              <a class="nav-link" href="#inne">Inne</a>
          </li>
        </ul>
        <form class="d-flex" role="search">
          <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-success" type="submit">Szukaj</button>
        </form>
      </div>
    </div>
  </nav>
