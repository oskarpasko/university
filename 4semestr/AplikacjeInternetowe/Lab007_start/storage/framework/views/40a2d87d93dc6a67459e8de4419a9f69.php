<!doctype html>
<html lang="pl">

<?php echo $__env->make('shared.header', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?>

<body>
    <?php echo $__env->make('shared.nav', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?>

    <div class="container mt-5 mb-5">
        <div class="row mb-1">
            <h1>Kraje</h1>
        </div>
        <div class="row mb-2">
            <a href="<?php echo e(route('countries.create')); ?>">Dodaj nowy kraj</a>
        </div>
        <div class="row">
            <table class="table table-hover table-striped">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Nazwa</th>
                        <th scope="col">Kod</th>
                        <th scope="col">Waluta</th>
                        <th scope="col">Powierzchnia</th>
                        <th scope="col">Język</th>
                    </tr>
                </thead>
                <tbody>
                    <?php $__empty_1 = true; $__currentLoopData = $countries; $__env->addLoop($__currentLoopData); foreach($__currentLoopData as $c): $__env->incrementLoopIndices(); $loop = $__env->getLastLoop(); $__empty_1 = false; ?>
                        <tr>
                            <th scope="row"><a href="<?php echo e(route('countries.show', $c)); ?>"><?php echo e($c->id); ?></a></th>
                            <td scope="row"><?php echo e($c->name); ?></td>
                            <td scope="row"><?php echo e($c->code); ?></td>
                            <td scope="row"><?php echo e($c->currency); ?></td>
                            <td scope="row"><?php echo e($c->area); ?></td>
                            <td scope="row"><?php echo e($c->language); ?></td>
                            <td scope="row"><a href="<?php echo e(route('countries.edit', $c)); ?>">Edycja</a></td>
                            <td>
                                <form method="POST" action="<?php echo e(route('countries.destroy', $c->id)); ?>">
                                    <?php echo csrf_field(); ?>
                                    <?php echo method_field('DELETE'); ?>
                                    <input type="submit" value="Usuń"></button>
                                </form>
                            </td>
                        </tr>
                    <?php endforeach; $__env->popLoop(); $loop = $__env->getLastLoop(); if ($__empty_1): ?>
                        <tr>
                            <th scope="row" colspan="6">Brak krajów.</th>
                        </tr>
                    <?php endif; ?>
                </tbody>
            </table>
        </div>
    </div>

    <?php echo $__env->make('shared.footer', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?>
</body>

</html>
<?php /**PATH /Users/oskarpasko/Documents/GitHub/University/4semestr/AplikacjeInternetowe/Lab007_start/resources/views/countries/index.blade.php ENDPATH**/ ?>