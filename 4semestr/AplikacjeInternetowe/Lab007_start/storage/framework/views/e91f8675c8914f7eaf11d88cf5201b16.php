<!doctype html>
<html lang="pl">

<?php echo $__env->make('shared.header', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?>

<body>
    <?php echo $__env->make('shared.nav', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?>

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
                    <td scope="row"><?php echo e($c->name); ?></td>
                    <td scope="row"><?php echo e($c->code); ?></td>
                    <td scope="row"><?php echo e($c->currency); ?></td>
                    <td scope="row"><?php echo e($c->area); ?></td>
                    <td scope="row"><?php echo e($c->language); ?></td>
                </tr>
        </tbody>
    </table>

    <?php echo $__env->make('shared.footer', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?>
</body>

</html>
<?php /**PATH /Users/oskarpasko/Documents/GitHub/University/4semestr/AplikacjeInternetowe/Lab007_start/resources/views/countries/show.blade.php ENDPATH**/ ?>