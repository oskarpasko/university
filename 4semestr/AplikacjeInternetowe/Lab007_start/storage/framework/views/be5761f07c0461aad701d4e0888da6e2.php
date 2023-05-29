<!doctype html>
<html lang="pl">
  <?php echo $__env->make('shared.header', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?>
  <body>
    <?php echo $__env->make('shared.nav', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?>
    <div id="start" class="mb-5">
      <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
        <div class="carousel-inner">
          <div class="carousel-item active">
            <img src="img/carousel1.jpg" class="d-block w-100" alt="...">
            <div class="carousel-caption d-none d-md-block">
              <h1>Niesamowite przeżycia!</h1>
            </div>
          </div>
          <div class="carousel-item">
            <img src="img/carousel2.jpg" class="d-block w-100" alt="...">
            <div class="carousel-caption d-none d-md-block">
              <h1>Niesamowite widoki!</h1>
            </div>
          </div>
          <div class="carousel-item">
            <img src="img/carousel3.jpg" class="d-block w-100" alt="...">
            <div class="carousel-caption d-none d-md-block">
              <h1>Piękno natury!</h1>
            </div>
          </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Next</span>
        </button>
      </div>
    </div>

    <div id="wycieczki" class="container mb-5">
      <div class="row">
          <h1>Wycieczki</h1>
      </div>
      <div class="row">
          <?php $__empty_1 = true; $__currentLoopData = $random_trips; $__env->addLoop($__currentLoopData); foreach($__currentLoopData as $t): $__env->incrementLoopIndices(); $loop = $__env->getLastLoop(); $__empty_1 = false; ?>
          <div class="col-12 col-sm-6 col-lg-3">
              <div class="card">
                  <img src="<?php echo e(asset('storage/img/'.$t->img)); ?>" class="card-img-top">
                  <div class="card-body">
                      <h5 class="card-title"><?php echo e($t->name); ?></h5>
                      <p class="card-text"><?php echo e($t->description); ?></p>
                      <a href="<?php echo e(route('trips.show', ['id' => $t->id])); ?>" class="btn btn-primary">Więcej szczegółów...</a>
                  </div>
              </div>
          </div>
          <?php endforeach; $__env->popLoop(); $loop = $__env->getLastLoop(); if ($__empty_1): ?>
                <p>Brak wycieczek.</p>
          <?php endif; ?>
      </div>
  </div>

  <div id="cennik" class="container mt-5 mb-5">
    <div class="row">
        <h1>Cennik</h1>
    </div>
    <table class="table table-hover table-striped">
        <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Nazwa wycieczki</th>
                <th scope="col">Kontynent</th>
                <th scope="col">Kraj</th>
                <th scope="col">Okres</th>
                <th scope="col">Cena</th>
            </tr>
        </thead>
        <tbody>
            <?php $__empty_1 = true; $__currentLoopData = $trips; $__env->addLoop($__currentLoopData); foreach($__currentLoopData as $t): $__env->incrementLoopIndices(); $loop = $__env->getLastLoop(); $__empty_1 = false; ?>
            <tr>
                <th scope="row"><?php echo e($t->id); ?></th>
                <td><?php echo e($t->name); ?></td>
                <td><?php echo e($t->continent); ?></td>
                <td><?php echo e($t->country->name); ?></td>
                <td><?php echo e($t->period); ?> dni</td>
                <td><?php echo e($t->price); ?> PLN</td>
            </tr>
            <?php endforeach; $__env->popLoop(); $loop = $__env->getLastLoop(); if ($__empty_1): ?>
            <tr>
                <th scope="row" colspan="6">Brak wycieczek.</th>
            </tr>
            <?php endif; ?>
        </tbody>
    </table>
  </div>

  <div id="inne" class="container mb-5">
    <div class="row">
        <div class="col-sm-12 col-md-6 mb-4">
            <h2>O naszych wycieczkach...</h2>
            <div class="ratio ratio-16x9">
                <iframe src="https://www.youtube.com/embed/t7ZpJ7wWlZI"></iframe>
            </div>
        </div>
        <div class="col-sm-12 col-md-6">
            <h2>Zapytanie o ofertę</h2>
            <form>
                <div class="form-group mt-2 mb-3">
                    <label for="exampleFormControlInput1">Adres email</label>
                    <input type="email" class="form-control" id="exampleFormControlInput1"
                        placeholder="name@example.com">
                </div>
                <div class="form-group mb-3">
                    <label for="exampleFormSelect1">Rodzaj oferty</label>
                    <select class="form-select" id="exampleFormControlSelect1">
                        <option selected>indywidualna</option>
                        <option>grupowa</option>
                        <option>specjalna</option>
                    </select>
                </div>
                <div class="form-group mb-3">
                    <label for="exampleFormControlBudget">Budżet</label>
                    <div class="input-group mb-3">
                      <input type="number" min="0" placeholder="20000" step="any" class="form-control">
                      <span class="input-group-text">PLN</span>
                    </div>
                </div>
                <div class="form-group mb-3">
                    <label for="exampleFormControlTextarea1">Komentarz</label>
                    <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
                </div>
                <div class="form-group mb-3 d-flex justify-content-center">
                    <a href="#" class="btn btn-primary">Wyślij</a>
                </div>
            </form>
        </div>
    </div>
</div>
<?php echo $__env->make('shared.footer', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?>
  </body>
</html>
<?php /**PATH /Users/oskarpasko/Documents/GitHub/University/4semestr/AplikacjeInternetowe/Lab007_start/resources/views/trips/index.blade.php ENDPATH**/ ?>