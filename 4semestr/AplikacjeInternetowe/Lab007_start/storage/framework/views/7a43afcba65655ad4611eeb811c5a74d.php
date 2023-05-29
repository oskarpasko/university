<!doctype html>
<html lang="pl">

<?php echo $__env->make('shared.header', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?>

<body>
    <?php echo $__env->make('shared.nav', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?>

    <div class="container mt-5 mb-5">
        <?php if(session('error')): ?>
            <div class="row d-flex justify-content-center">
                <div class="alert alert-danger"><?php echo e(session('error')); ?></div>
            </div>
        <?php endif; ?>
        <div class="row mt-4 mb-4 text-center">
            <h1>Dodaj nowy kraj</h1>
        </div>

        <?php if($errors->any()): ?>
            <div class="row d-flex justify-content-center">
                <div class="col-6">
                    <div class="alert alert-danger">
                        <ul>
                            <?php $__currentLoopData = $errors->all(); $__env->addLoop($__currentLoopData); foreach($__currentLoopData as $error): $__env->incrementLoopIndices(); $loop = $__env->getLastLoop(); ?>
                                <li><?php echo e($error); ?></li>
                            <?php endforeach; $__env->popLoop(); $loop = $__env->getLastLoop(); ?>
                        </ul>
                    </div>
                </div>
            </div>
        <?php endif; ?>

        <div class="row d-flex justify-content-center">
            <div class="col-6">
                <form method="POST" action="<?php echo e(route('countries.store')); ?>" class="needs-validation" novalidate>
                    <?php echo csrf_field(); ?>
                    <div class="form-group mb-2">
                        <label for="name">Nazwa</label>
                        <input id="name" name="name" type="text" class="form-control">
                        <div class="invalid-feedback">Nieprawidłowe nazwa!</div>
                    </div>
                    <div class="form-group mb-2">
                        <label for="code">Kod</label>
                        <input id="code" name="code" type="text" class="form-control">
                        <div class="invalid-feedback">Nieprawidłowy kod!</div>
                    </div>
                    <div class="form-group mb-2">
                        <label for="currency">Waluta</label>
                        <input id="currency" name="currency" type="text" class="form-control">
                        <div class="invalid-feedback">Nieprawidłowa waluta!</div>
                    </div>
                    <div class="form-group mb-2">
                        <label for="currency">Powierzchnia</label>
                        <input id="area" name="area" type="text" class="form-control">
                        <div class="invalid-feedback">Nieprawidłowa powierzchnia!</div>
                    </div>
                    <div class="form-group mb-2">
                        <label for="language">Język</label>
                        <input id="language" name="language" type="text" class="form-control">
                        <div class="invalid-feedback">Nieprawidłowy język!</div>
                    </div>
                    <div class="text-center mt-4 mb-4">
                        <input class="btn btn-success" type="submit" value="Wyślij">
                    </div>
                </form>
            </div>
        </div>
    </div>

    <?php echo $__env->make('shared.footer', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?>
</body>

</html>
<?php /**PATH /Users/oskarpasko/Documents/GitHub/University/4semestr/AplikacjeInternetowe/Lab007_start/resources/views/countries/create.blade.php ENDPATH**/ ?>