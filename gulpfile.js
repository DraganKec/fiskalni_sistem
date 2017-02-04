var gulp = require('gulp');
var sass = require('gulp-sass');
var browserSync = require('browser-sync').create();

gulp.task('sass', function() {
    return gulp.src('src/main/resources/static/**/*.scss') // Gets all files ending with .scss in app/scss and children dirs
        .pipe(sass())
        .pipe(gulp.dest('build/resources/static'))
        .pipe(browserSync.reload({
            stream: true
        }))
});

gulp.task('watch', ['browserSync', 'sass'],  function(){
    gulp.watch('src/main/resources/static/**/*.scss', ['sass']);

    gulp.watch('src/main/resources/static/*.html', browserSync.reload);
    gulp.watch('src/main/resources/static/**/*.js', browserSync.reload);
});

gulp.task('browserSync', function() {
    browserSync.init({
        server: {
            baseDir: 'src/main/resources/static'
        }
    })
});